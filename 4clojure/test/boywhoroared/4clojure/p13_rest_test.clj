(ns
 boywhoroared.4clojure.p13-rest-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ '(20 30 40))
;; `rest` returns the tail of a list as a sequence

(deftest
  problem-13-test
  (testing "Problem 13: " (is (= __ (rest [10 20 30 40])))))

(run-tests)

