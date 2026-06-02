(ns
 boywhoroared.4clojure.p47-contain-yourself-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-47-test
 (testing
  "Problem 47: "
  (is (contains? #{4 6 5} __))
  (is (contains? [1 1 1 1 1] __))
  (is (contains? {4 :a, 2 :b} __))
  (is (not (contains? [1 2 4] __)))))

