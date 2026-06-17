(ns
  ^{:id 114 :difficulty "medium" :tags ["seqs" "higher-order-functions"] :description "take-while is great for
filtering sequences, but it limited:
you can only examine a single item of the sequence at a time.
What if you need to keep track of
some state as you go over the sequence?

Write a function which accepts an integer n,
a predicate p, and a sequence.
It should return a lazy sequence of items in the list up to,
but not including, the nth item that satisfies the predicate."} boywhoroared.4clojure.p114-global-take-while-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-114-test
     (testing "Problem 114: take-while is great for
filtering sequences, but it limited:
you can only examine a single item of the sequence at a time.
What if you need to keep track of
some state as you go over the sequence?

Write a function which accepts an integer n,
a predicate p, and a sequence.
It should return a lazy sequence of items in the list up to,
but not including, the nth item that satisfies the predicate."
       (is (= [2 3 5 7 11 13]
                       (__ 4 #(= 2 (mod % 3))
                            [2 3 5 7 11 13 17 19 23])))
(is (= ["this" "is" "a" "sentence"]
                       (__ 3 #(some #{\i} %)
                            ["this" "is" "a" "sentence" "i" "wrote"])))
(is (= ["this" "is"]
                       (__ 1 #{"a"}
                            ["this" "is" "a" "sentence" "i" "wrote"])))))