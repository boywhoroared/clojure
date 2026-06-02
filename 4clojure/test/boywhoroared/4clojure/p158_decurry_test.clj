(ns
 boywhoroared.4clojure.p158-decurry-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-158-test
 (testing
  "Problem 158: "
  (is
   (=
    10
    ((__ (fn [a] (fn [b] (fn [c] (fn [d] (+ a b c d)))))) 1 2 3 4)))
  (is
   (=
    24
    ((__ (fn [a] (fn [b] (fn [c] (fn [d] (* a b c d)))))) 1 2 3 4)))
  (is (= 25 ((__ (fn [a] (fn [b] (* a b)))) 5 5)))))

