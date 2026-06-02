(ns
 boywhoroared.4clojure.p70-word-sorting-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-70-test
 (testing
  "Problem 70: "
  (is (= (__ "Have a nice day.") ["a" "day" "Have" "nice"]))
  (is
   (=
    (__ "Clojure is a fun language!")
    ["a" "Clojure" "fun" "is" "language"]))
  (is
   (=
    (__ "Fools fall for foolish follies.")
    ["fall" "follies" "foolish" "Fools" "for"]))))

