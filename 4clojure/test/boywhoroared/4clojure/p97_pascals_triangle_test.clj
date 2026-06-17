(ns
  ^{:id 97 :difficulty "easy" :tags [] :description "Pascal's triangle is a triangle of numbers
computed using the following rules:

- The first row is 1.
- Each successive row is computed by
  adding together adjacent numbers in the row above,
and adding a 1 to the beginning and end of the row.

Write a function which returns
:the nth row of Pascal's Triangle."} boywhoroared.4clojure.p97-pascals-triangle-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-97-test
     (testing "Problem 97: Pascal's triangle is a triangle of numbers
computed using the following rules:

- The first row is 1.
- Each successive row is computed by
  adding together adjacent numbers in the row above,
and adding a 1 to the beginning and end of the row.

Write a function which returns
:the nth row of Pascal's Triangle."
       (is (= (__ 1) [1]))
(is (= (map __ (range 1 6))
   [     [1]
        [1 1]
       [1 2 1]
      [1 3 3 1]
     [1 4 6 4 1]]))
(is (= (__ 11)
   [1 10 45 120 210 252 210 120 45 10 1]))
(is (= (__ 11)
   [1 10 45 120 210 252 210 120 45 10 1]))))