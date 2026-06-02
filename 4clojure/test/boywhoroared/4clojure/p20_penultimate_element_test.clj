(ns
 boywhoroared.4clojure.p20-penultimate-element-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-20-test
 (testing
  "Problem 20: "
  (is (= (__ (list 1 2 3 4 5)) 4))
  (is (= (__ ["a" "b" "c"]) "b"))
  (is (= (__ [[1 2] [3 4]]) [1 2]))))

