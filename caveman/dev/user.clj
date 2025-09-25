;; While doing interactive development, it's important to have a
;; place to put code which is useful for that purpose, but maybe not
;; appropriate for software you ultimately ship (production)

;; Most REPLs will automatically load in any `user` namespace.
;; This makes it the easiest place to put "development only" code.

;; We only use it for development, so we create an alias for it in `deps.edn`
;; We don't want to include it in our normal build.
;; See <https://github.com/Oddsor/userclj-footgun>

;; Basically, the user namespace loads too early during compilation and won't be able to find
;; the other classes it requires.
;;
;; Two of the solutions are:
;; - Place the `user` namespace in a folder that is never loaded during compilation
;;   This is one via the `dev` alias with extra-paths
;; - Or put your convenience functions in a different namespace (I think the Ring docs do this when showing examples for development)

(ns user
  (:require [example.system :as system]))

(set! *warn-on-reflection* true)

(def system nil)

(defn start-system! "Start the system if not already started" []
  (if system
    (println "Already started!")
    (alter-var-root #'system (constantly (system/start-system)))))
;; Calls `start-system` from `example.system` and sets the value of `system` to the return value (of `start-system`)
;; `alter-var-root` rebinds the symbol `system` to the result of fn expr returned by `(constantly ...)`
;; `constantly` creates a function that accepts any number of arguments and always returns the give expr. In this case, the server.
;;

;; Instead of `#'system`, one could also use (var system) ?

(defn stop-system! []
  (when system
    (system/stop-system system)
    (alter-var-root #'system (constantly nil)))) ; if the system wasn't started, this should be a no-op

(defn restart-system! []
  (stop-system!)
  (start-system!))

(defn server []
  (::system/server system))

(defn db []
  (::system/db system))

(defn env []
  (::system/env system))

(comment
  (require '[clojure.repl :refer [doc, source, dir, apropos]])
  (require '[clojure.tools.namespace.repl :refer [refresh]])
  (refresh)
  (start-system!)
  (stop-system!)
  (restart-system!)
  (prn (::system/server system)))
