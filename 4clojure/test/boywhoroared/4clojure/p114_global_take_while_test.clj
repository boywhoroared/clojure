(ns
 boywhoroared.4clojure.p114-global-take-while-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-114-test
 (testing
  "Problem 114: "
  (is
   (=
    [2 3 5 7 11 13]
    (__
     4
     (fn* [p1__202#] (= 2 (mod p1__202# 3)))
     [2 3 5 7 11 13 17 19 23])))
  (is
   (=
    ["this" "is" "a" "sentence"]
    (__
     3
     (fn* [p1__203#] (some #{\i} p1__203#))
     ["this" "is" "a" "sentence" "i" "wrote"])))
  (is
   (=
    ["this" "is"]
    (__ 1 #{"a"} ["this" "is" "a" "sentence" "i" "wrote"])))))

