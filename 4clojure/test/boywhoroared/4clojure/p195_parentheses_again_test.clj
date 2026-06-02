(ns
 boywhoroared.4clojure.p195-parentheses-again-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-195-test
 (testing
  "Problem 195: "
  (is
   (= [#{""} #{"()"} #{"(())" "()()"}] (map (fn [n] (__ n)) [0 1 2])))
  (is (= #{"(()())" "((()))" "()()()" "()(())" "(())()"} (__ 3)))
  (is (= 16796 (count (__ 10))))
  (is
   (=
    (nth
     (sort
      (filter
       (fn*
        [p1__230#]
        (clojure.string/includes? p1__230# "(()()()())"))
       (__ 9)))
     6)
    "(((()()()())(())))"))
  (is (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))"))))

