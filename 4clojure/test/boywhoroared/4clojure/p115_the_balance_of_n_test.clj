(ns
  ^{:id 115 :difficulty "medium" :tags ["math"] :description "A balanced number is one whose component digits
have the same sum on the left and right halves of the number.
Write a function which accepts an integer n,
and returns true iff n is balanced."} boywhoroared.4clojure.p115-the-balance-of-n-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-115-test
     (testing "Problem 115: A balanced number is one whose component digits
have the same sum on the left and right halves of the number.
Write a function which accepts an integer n,
and returns true iff n is balanced."
       (is (= true (__ 11)))
(is (= true (__ 121)))
(is (= false (__ 123)))
(is (= true (__ 0)))
(is (= false (__ 88099)))
(is (= true (__ 89098)))
(is (= true (__ 89089)))
(is (= (take 20 (filter __ (range)))
                       [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101]))))