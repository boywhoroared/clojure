(ns
 boywhoroared.4clojure.p64-intro-to-reduce-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-64-test
 (testing
  "Problem 64: "
  (is (= 15 (reduce __ [1 2 3 4 5])))
  (is (= 0 (reduce __ [])))
  (is (= 6 (reduce __ 1 [2 3])))))

