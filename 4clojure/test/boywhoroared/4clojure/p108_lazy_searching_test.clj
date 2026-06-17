(ns
  ^{:id 108 :difficulty "medium" :tags ["seqs" "sorting"] :description "Given any number of sequences,
each sorted from smallest to largest,
find the smallest single number
which appears in all of the sequences.
The sequences may be infinite, so be careful to search lazily."} boywhoroared.4clojure.p108-lazy-searching-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-108-test
     (testing "Problem 108: Given any number of sequences,
each sorted from smallest to largest,
find the smallest single number
which appears in all of the sequences.
The sequences may be infinite, so be careful to search lazily."
       (is (= 3 (__ [3 4 5])))
(is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
(is (= 64 (__ (map #(* % % %) (range))
                                 (filter #(zero? (bit-and % (dec %))) (range))
                                 (iterate inc 20))))
(is (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])))))