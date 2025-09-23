(ns example.routes
  (:require [reitit.ring :as reitit-ring]
            [clojure.tools.logging :as log]
            [hiccup2.core :as hiccup]))

(defn hello-handler [_system _request] ; Prefixing a parameter with underscore, or simply using an underscore as the name, is a convention that indicates the parameter is unused.
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str (hiccup/html
               [:html
                [:body
                 [:h1 "Hello, world"]]]))})

(defn goodbye-handler [_system _request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str (hiccup/html
               [:html
                [:body
                 [:h1  "Goodbye, world!"]]]))})

;; Unlike the other handlers, we're not passing `system` here.
;; At first, I incorrectly had `system` as a paramater, so I got an `ArityException`
(defn not-found-handler [_request]
  {:status 400 :headers {"Content-Type" "text/html"} :body (str (hiccup/html [:html [:body [:h1 "Not Found"]]]))})

;; Forward `system` to the handlers. Basically dependency injection.
;; We do this because system is how we get access to the database client.
;; And the handlers will need the db to fetch data
(defn routes [system]
  [["/"   {:get {:handler (partial #'hello-handler system)}}]
   ["/goodbye"   {:get {:handler (partial #'goodbye-handler system)}}]])

;; We're using var references to the handler functions. 
;; <https://clojure.org/guides/weird_characters#_var_quote>
;; 
;; var quote is a reader macro that expands to (var x).
;; See <https://clojuredocs.org/clojure.core/var>
;;
;; That is, we're passing the symbol references
;; not the actual function values. The router will deference these to invoke the function.

;; See: <https://cljdoc.org/d/metosin/reitit/0.9.1/doc/advanced/dev-workflow?q=reload#var-handlers>

;; In development, it allows us to modify the handler without rebuilding the routes

(defn root-handler
  [system request]
  (log/info (str (:request-method request) " - " (:uri request)))
  (let [handler (reitit-ring/ring-handler
                 (reitit-ring/router (routes system)) #'not-found-handler)] ; `(reitit-ring/ringer-handler router default-handler)
    (handler request)))
;; This compiles the routes (invoking `(routes system)`) on every request.
;; Thsi is slow but convenient for development. We will make it fast later
