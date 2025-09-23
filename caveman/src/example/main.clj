(ns example.main
  (:require [example.system :as system]))

(defn -main []
  (system/start-system))

;; Using `#'` as prefix to the function name `handler` makes it so that if we reload the function in a REPL,
;; the server will use the new definition right away.
