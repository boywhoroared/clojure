(ns
 boywhoroared.4clojure.p57-simple-recursion-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-57-test
  (testing
   "Problem 57: "
    (is (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))

