(ns
  ^{:id 70 :difficulty "medium" :tags ["sorting"] :description "Write a function which splits a sentence up
into a sorted list of words.
Capitalization should not affect sort order
and punctuation should be ignored."} boywhoroared.4clojure.p70-word-sorting-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-70-test
     (testing "Problem 70: Write a function which splits a sentence up
into a sorted list of words.
Capitalization should not affect sort order
and punctuation should be ignored."
       (is (= (__  "Have a nice day.")
   ["a" "day" "Have" "nice"]))
(is (= (__  "Clojure is a fun language!")
   ["a" "Clojure" "fun" "is" "language"]))
(is (= (__  "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"]))))