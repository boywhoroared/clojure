(ns
  ^{:id 60 :difficulty "medium" :tags ["seqs" "core-functions"] :description "Write a function which behaves like reduce,
but returns each intermediate value of the reduction.
Your function must accept either two or three arguments,
and the return sequence must be lazy."} boywhoroared.4clojure.p60-sequence-reductions-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-60-test
     (testing "Problem 60: Write a function which behaves like reduce,
but returns each intermediate value of the reduction.
Your function must accept either two or three arguments,
and the return sequence must be lazy."
       (is (= (take 5 (__ + (range))) [0 1 3 6 10]))
(is (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
(is (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120))))