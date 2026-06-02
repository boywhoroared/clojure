(ns
 ^{:difficulty "hard", :tags ["graph-theory"], :description "Write a function which calculates\nthe sum of the minimal path through a triangle.\nThe triangle is represented as a vector of vectors.\nThe path should start at the top of the triangle\nand move to an adjacent number on the next row\nuntil the bottom of the triangle is reached."} boywhoroared.4clojure.p79-triangle-minimal-path-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-79-test
 (testing
  "Problem 79: Write a function which calculates\nthe sum of the minimal path through a triangle.\nThe triangle is represented as a vector of vectors.\nThe path should start at the top of the triangle\nand move to an adjacent number on the next row\nuntil the bottom of the triangle is reached."
  (is (= (__ [[1] [2 4] [5 1 4] [2 3 4 5]]) (+ 1 2 1 3) 7))
  (is
   (=
    (__ [[3] [2 4] [1 9 3] [9 9 2 4] [4 6 6 7 8] [5 7 3 5 1 4]])
    (+ 3 4 3 2 7 1)
    20))))

