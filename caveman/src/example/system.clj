(ns example.system
  (:require [ring.adapter.jetty :as jetty]
            [example.routes :as routes])
  (:import (org.eclipse.jetty.server Server)))

;; This file is where put all the "stateful" things like database connections
;; and clients to external services.

(defn start-server "Starts the Jetty server" []
  (jetty/run-jetty #'routes/handler {:port 9999 :join? false})) ; `:join? false` configures the server to run in the background.

;; See 
;; - <https://github.com/ring-clojure/ring/wiki/Getting-Started>
;; - <https://ring-clojure.github.io/ring/ring.adapter.jetty.html>

(defn stop-server "Stops the Jetty server" [server]
  (Server/.stop server))

(defn start-system []
  {::server (start-server)})

; Presumably, `start-server` returns an expr that evaluates to a Server instance?
; And we store the reference to this instance in state
; This state will be initialied by `start-system`

(defn stop-system [system]
  (stop-server (::server system)))
;; This gets the value of the ::server keyword from the map referenced by `system`
;; and passes it to `stop-server`.
;;
;; The `::` is shorthand for `example.system/` so, the full keyword is `:example.system/server`

;; In development, you can setup a hot-reloading server
;; See <https://github.com/ring-clojure/ring/wiki/Setup-for-development>

