(ns example.system
  (:require [ring.adapter.jetty :as jetty]
            [next.jdbc.connection :as connection]
            [example.routes :as routes])
  (:import (org.eclipse.jetty.server Server)
           (com.zaxxer.hikari HikariDataSource)))

;; Fixes linting error because we're using Java interop
;; (We import the class `org.eclipse.jetty.server.Server` and we invoke a Java class method in `stop-server`)
(set! *warn-on-reflection* true)

;; This file is where put all the "stateful" things like database connections
;; and clients to external services.

(defn start-db []
  (connection/->pool HikariDataSource ; more Java interop
                     {:dbtype "postgres"
                      :dbname "postgres"
                      :username "postgres"
                      :password "postgres"})) ; Shouldn't we pull this from a .env?
(defn stop-db [db]
  (HikariDataSource/.close db)) ; Java interop

(defn start-server "Starts the Jetty server" [system]
  (jetty/run-jetty (partial #'routes/root-handler system) {:port 9999 :join? false}))
; `:join? false` configures the server to run in the background.

;; See 
;; - <https://github.com/ring-clojure/ring/wiki/Getting-Started>
;; - <https://ring-clojure.github.io/ring/ring.adapter.jetty.html>

(defn stop-server "Stops the Jetty server" [server]
  (Server/.stop server))

;; `server` is one of the components/services in `system` but `server`
;; itself needs access to `system` (circular dependendy?), so we 
;; created a symbol to represent a "system" that is "everything minus the server":
;; `system-so-far`.

(defn start-system []
  (let [system-so-far {::db (start-db)}]
    (merge system-so-far {::server (start-server system-so-far)})))

; `start-server` returns an expr that evaluates to a Server instance
; And we store the reference to this instance in state
; This state will be initialied by `start-system`

(defn stop-system [system]
  (stop-server (::server system))
  (stop-db (::db system)))

;; This gets the value of the ::server keyword from the map referenced by `system`
;; and passes it to `stop-server`.
;;
;; The `::` is shorthand for `example.system/` so, the full keyword is `:example.system/server`

;; In development, you can setup a hot-reloading server
;; See <https://github.com/ring-clojure/ring/wiki/Setup-for-development>

