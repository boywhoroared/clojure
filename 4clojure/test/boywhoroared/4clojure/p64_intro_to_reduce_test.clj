(ns
  ^{:id 64 :difficulty "elementary" :tags ["seqs"] :description "Reduce takes a 2 argument function
and an optional starting value.
It then applies the function to the first 2 items in the sequence
(or the starting value and the first element of the sequence).
In the next iteration the function will be called on
the previous return value and the next item from the sequence,
thus reducing the entire collection to one value.
Don't worry, it's not as complicated as it sounds."} boywhoroared.4clojure.p64-intro-to-reduce-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-64-test
     (testing "Problem 64: Reduce takes a 2 argument function
and an optional starting value.
It then applies the function to the first 2 items in the sequence
(or the starting value and the first element of the sequence).
In the next iteration the function will be called on
the previous return value and the next item from the sequence,
thus reducing the entire collection to one value.
Don't worry, it's not as complicated as it sounds."
       (is (= 15 (reduce __ [1 2 3 4 5])))
(is (=  0 (reduce __ [])))
(is (=  6 (reduce __ 1 [2 3])))))