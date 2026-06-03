(ns
 ^{:difficulty "medium", :tags ["seqs" "core-functions"], :description "Write a function which behaves like reduce,\nbut returns each intermediate value of the reduction.\nYour function must accept either two or three arguments,\nand the return sequence must be lazy."} boywhoroared.4clojure.p60-sequence-reductions-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-60-test
 (testing
  "Problem 60: Write a function which behaves like reduce,\nbut returns each intermediate value of the reduction.\nYour function must accept either two or three arguments,\nand the return sequence must be lazy."
  (is (= (take 5 (__ + (range))) [0 1 3 6 10]))
  (is (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (is (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120))))

