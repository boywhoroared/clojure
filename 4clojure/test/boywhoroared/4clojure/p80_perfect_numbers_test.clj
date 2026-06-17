(ns
  ^{:id 80 :difficulty "medium" :tags [] :description "A number is "perfect" if the sum of its divisors
equal the number itself.
6 is a perfect number because 1+2+3=6.
Write a function which returns true for perfect numbers
and false otherwise."} boywhoroared.4clojure.p80-perfect-numbers-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-80-test
     (testing "Problem 80: A number is "perfect" if the sum of its divisors
equal the number itself.
6 is a perfect number because 1+2+3=6.
Write a function which returns true for perfect numbers
and false otherwise."
       (is (= (__ 6) true))
(is (= (__ 7) false))
(is (= (__ 496) true))
(is (= (__ 500) false))
(is (= (__ 8128) true))))