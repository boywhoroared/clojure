(ns
  ^{:id 86 :difficulty "medium" :tags ["math"] :description "Happy numbers are positive integers that
follow a particular formula:
take each individual digit, square it,
and then sum the squares to get a new number.
Repeat with the new number and eventually,
you might get to a number whose squared sum is 1.
This is a happy number.
An unhappy number (or sad number) is one that loops endlessly.
Write a function that determines if a number is happy or not."} boywhoroared.4clojure.p86-happy-numbers-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-86-test
     (testing "Problem 86: Happy numbers are positive integers that
follow a particular formula:
take each individual digit, square it,
and then sum the squares to get a new number.
Repeat with the new number and eventually,
you might get to a number whose squared sum is 1.
This is a happy number.
An unhappy number (or sad number) is one that loops endlessly.
Write a function that determines if a number is happy or not."
       (is (= (__ 7) true))
(is (= (__ 986543210) true))
(is (= (__ 2) false))
(is (= (__ 3) false))))