(ns
 ^{:difficulty "medium", :tags ["higher-order-functions" "core-functions"], :description "Write a function which\nallows you to create function compositions.\nThe parameter list should take a variable number of functions,\nand create a function applies them from right-to-left."} boywhoroared.4clojure.p58-function-composition-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-58-test
 (testing
  "Problem 58: Write a function which\nallows you to create function compositions.\nThe parameter list should take a variable number of functions,\nand create a function applies them from right-to-left."
  (is (= [3 2 1] ((__ rest reverse) [1 2 3 4])))
  (is (= 5 ((__ (partial + 3) second) [1 2 3 4])))
  (is
   (= true ((__ zero? (fn* [p1__189#] (mod p1__189# 8)) +) 3 5 7 9)))
  (is
   (=
    "HELLO"
    ((__
      (fn* [p1__190#] (.toUpperCase p1__190#))
      (fn* [p1__191#] (apply str p1__191#))
      take)
     5
     "hello world")))))

