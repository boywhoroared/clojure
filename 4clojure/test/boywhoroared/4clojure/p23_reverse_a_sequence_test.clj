(ns
 boywhoroared.4clojure.p23-reverse-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-23-test
 (testing
  "Problem 23: "
  (is (= (__ [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (__ (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (__ [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))))

