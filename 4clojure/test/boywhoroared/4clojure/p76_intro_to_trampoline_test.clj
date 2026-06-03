(ns
 ^{:difficulty "medium", :tags ["recursion"], :description "The trampoline function takes a function f\nand a variable number of parameters.\nTrampoline calls f with any parameters that were supplied.\nIf f returns a function, trampoline\ncalls that function with no arguments.\nThis is repeated, until the return value is not a function,\nand then trampoline returns that non-function value.\nThis is useful for implementing mutually recursive algorithms\nin a way that won't consume the stack."} boywhoroared.4clojure.p76-intro-to-trampoline-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-76-test
 (testing
  "Problem 76: The trampoline function takes a function f\nand a variable number of parameters.\nTrampoline calls f with any parameters that were supplied.\nIf f returns a function, trampoline\ncalls that function with no arguments.\nThis is repeated, until the return value is not a function,\nand then trampoline returns that non-function value.\nThis is useful for implementing mutually recursive algorithms\nin a way that won't consume the stack."
  (is
   (=
    __
    (letfn
     [(foo [x y] (fn* [] (bar (conj x y) y)))
      (bar [x y] (if (> (last x) 10) x (fn* [] (foo x (+ 2 y)))))]
     (trampoline foo [] 1))))))

