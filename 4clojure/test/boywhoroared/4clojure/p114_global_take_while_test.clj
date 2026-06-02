(ns
 ^{:difficulty "medium", :tags ["seqs" "higher-order-functions"], :description "take-while is great for\nfiltering sequences, but it limited:\nyou can only examine a single item of the sequence at a time.\nWhat if you need to keep track of\nsome state as you go over the sequence?\n\nWrite a function which accepts an integer n,\na predicate p, and a sequence.\nIt should return a lazy sequence of items in the list up to,\nbut not including, the nth item that satisfies the predicate."} boywhoroared.4clojure.p114-global-take-while-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-114-test
 (testing
  "Problem 114: take-while is great for\nfiltering sequences, but it limited:\nyou can only examine a single item of the sequence at a time.\nWhat if you need to keep track of\nsome state as you go over the sequence?\n\nWrite a function which accepts an integer n,\na predicate p, and a sequence.\nIt should return a lazy sequence of items in the list up to,\nbut not including, the nth item that satisfies the predicate."
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

