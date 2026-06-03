(ns
 ^{:difficulty "easy", :tags ["seqs" "core-functions"], :description "Write a function which creates a list\nof all integers in a given range."} boywhoroared.4clojure.p34-implement-range-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-34-test
 (testing
  "Problem 34: Write a function which creates a list\nof all integers in a given range."
  (is (= (__ 1 4) '(1 2 3)))
  (is (= (__ -2 2) '(-2 -1 0 1)))
  (is (= (__ 5 8) '(5 6 7)))))

