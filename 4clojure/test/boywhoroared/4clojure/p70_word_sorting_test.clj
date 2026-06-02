(ns
 ^{:difficulty "medium", :tags ["sorting"], :description "Write a function which splits a sentence up\ninto a sorted list of words.\nCapitalization should not affect sort order\nand punctuation should be ignored."} boywhoroared.4clojure.p70-word-sorting-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-70-test
 (testing
  "Problem 70: Write a function which splits a sentence up\ninto a sorted list of words.\nCapitalization should not affect sort order\nand punctuation should be ignored."
  (is (= (__ "Have a nice day.") ["a" "day" "Have" "nice"]))
  (is
   (=
    (__ "Clojure is a fun language!")
    ["a" "Clojure" "fun" "is" "language"]))
  (is
   (=
    (__ "Fools fall for foolish follies.")
    ["fall" "follies" "foolish" "Fools" "for"]))))

