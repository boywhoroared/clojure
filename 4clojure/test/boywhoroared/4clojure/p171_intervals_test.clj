(ns
 ^{:difficulty "medium", :tags [], :description "Write a function that takes a sequence of integers\nand returns a sequence of “intervals”.\nEach interval is a a vector of two integers, start and end,\nsuch that all integers between start and end (inclusive)\nare contained in the input sequence."} boywhoroared.4clojure.p171-intervals-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-171-test
 (testing
  "Problem 171: Write a function that takes a sequence of integers\nand returns a sequence of “intervals”.\nEach interval is a a vector of two integers, start and end,\nsuch that all integers between start and end (inclusive)\nare contained in the input sequence."
  (is (= (__ [1 2 3]) [[1 3]]))
  (is (= (__ [10 9 8 1 2 3]) [[1 3] [8 10]]))
  (is (= (__ [1 1 1 1 1 1 1]) [[1 1]]))
  (is (= (__ []) []))
  (is
   (=
    (__ [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
    [[1 4] [6 6] [9 11] [13 17] [19 19]]))))

