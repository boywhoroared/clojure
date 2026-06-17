(ns
  ^{:id 110 :difficulty "medium" :tags ["seqs"] :description "Write a function that returns
a lazy sequence of "pronunciations" of a sequence of numbers.
A pronunciation of each element in the sequence
consists of the number of repeating identical numbers
and the number itself.
For example, [1 1] is pronounced as [2 1] ("two ones"),
which in turn is pronounced as [1 2 1 1] ("one two, one one") .
Your function should accept an initial sequence of numbers,
and return an infinite lazy sequence of pronunciations,
each element being a pronunciation of the previous element."} boywhoroared.4clojure.p110-sequence-of-pronunciations-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-110-test
     (testing "Problem 110: Write a function that returns
a lazy sequence of "pronunciations" of a sequence of numbers.
A pronunciation of each element in the sequence
consists of the number of repeating identical numbers
and the number itself.
For example, [1 1] is pronounced as [2 1] ("two ones"),
which in turn is pronounced as [1 2 1 1] ("one two, one one") .
Your function should accept an initial sequence of numbers,
and return an infinite lazy sequence of pronunciations,
each element being a pronunciation of the previous element."
       (is (= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1]))))
(is (= [3 1 2 4] (first (__[1 1 1 4 4]))))
(is (= [1 1 1 3 2 1 3 2 1 1] (nth (__ [1]) 6)))
(is (= 338 (count (nth (__ [3 2]) 15))))))