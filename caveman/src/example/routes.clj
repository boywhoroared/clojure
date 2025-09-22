(ns example.routes
  (:require [reitit.ring :as reitit-ring]))

(defn hello-handler [system request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, world"})

(defn goodbye-handler [system request]
  {:status 200 :headers {"Content-Type" "text/html"} :body "Goodbye, world!"})

;; Unlike the other handlers, we're not passing `system` here.
;; At first, I incorrectly had `system` as a paramater, so I got an `ArityException`
(defn not-found-handler [_request]
  {:status 400 :headers {"Content-Type" "text/html"} :body "Not Found"})

;; Forward `system` to the handlers. Basically dependency injection.
;; We do this because system is how we get access to the database client.
;; And the handlers will need the db to fetch data
(defn routes [system]
  [["/"   {:get {:handler (partial #'hello-handler system)}}]
   ["/goodbye"   {:get {:handler (partial #'goodbye-handler system)}}]])

(defn root-handler
  [system request]
  (let [handler (reitit-ring/ring-handler
                 (reitit-ring/router (routes system)) #'not-found-handler)] ; `(reitit-ring/ringer-handler router default-handler)
    (handler request)))
;; This compiles the routes (invoking `(routes system)`) on every request.
;; Thsi is slow but convenient for development. We will make it fast later
