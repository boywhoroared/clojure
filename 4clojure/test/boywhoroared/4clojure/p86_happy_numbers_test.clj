(ns
 ^{:difficulty "medium", :tags ["math"], :description "Happy numbers are positive integers that\nfollow a particular formula:\ntake each individual digit, square it,\nand then sum the squares to get a new number.\nRepeat with the new number and eventually,\nyou might get to a number whose squared sum is 1.\nThis is a happy number.\nAn unhappy number (or sad number) is one that loops endlessly.\nWrite a function that determines if a number is happy or not."} boywhoroared.4clojure.p86-happy-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-86-test
 (testing
  "Problem 86: Happy numbers are positive integers that\nfollow a particular formula:\ntake each individual digit, square it,\nand then sum the squares to get a new number.\nRepeat with the new number and eventually,\nyou might get to a number whose squared sum is 1.\nThis is a happy number.\nAn unhappy number (or sad number) is one that loops endlessly.\nWrite a function that determines if a number is happy or not."
  (is (= (__ 7) true))
  (is (= (__ 986543210) true))
  (is (= (__ 2) false))
  (is (= (__ 3) false))))

