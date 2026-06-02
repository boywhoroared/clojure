(ns
 ^{:difficulty "medium", :tags ["partial-functions"], :description "Write a function that accepts a curried function of unknown arity n.\nReturn an equivalent function of n arguments. "} boywhoroared.4clojure.p158-decurry-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-158-test
 (testing
  "Problem 158: Write a function that accepts a curried function of unknown arity n.\nReturn an equivalent function of n arguments. "
  (is
   (=
    10
    ((__ (fn [a] (fn [b] (fn [c] (fn [d] (+ a b c d)))))) 1 2 3 4)))
  (is
   (=
    24
    ((__ (fn [a] (fn [b] (fn [c] (fn [d] (* a b c d)))))) 1 2 3 4)))
  (is (= 25 ((__ (fn [a] (fn [b] (* a b)))) 5 5)))))

