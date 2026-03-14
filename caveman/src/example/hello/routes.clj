(ns example.hello.routes
  (:require
   [example.system :as-alias system]
   [hiccup2.core :as hiccup]
   [next.jdbc :as jdbc]))

;; Destructures (associative destructuring) the `system` argument (namespaced keyword)
;; such that the value is bound to the local name part of the key and drops the namespace.
;; That is, `example.system/db` will be bound locally to `db`
;; See:
;; - <https://clojure.org/guides/destructuring#_associative_destructuring>
;; - <https://clojure.org/guides/destructuring#_namespaced_keywords>
(defn hello-handler [{::system/keys [db]} _request] ; Prefixing a parameter with underscore, or simply using an underscore as the name, is a convention that indicates the parameter is unused.
  (let [{:keys [planet]} (jdbc/execute-one! db ["select 'earth' as planet"])]
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body (str (hiccup/html
                 [:html
                  [:body
                   [:h1 "Hello, " planet]]]))}))

(defn routes [system]
  [["/" {:get {:handler (partial #'hello-handler system)}}]])
