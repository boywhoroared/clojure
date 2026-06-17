(ns
  ^{:id 76 :difficulty "medium" :tags ["recursion"] :description "The trampoline function takes a function f
and a variable number of parameters.
Trampoline calls f with any parameters that were supplied.
If f returns a function, trampoline
calls that function with no arguments.
This is repeated, until the return value is not a function,
and then trampoline returns that non-function value.
This is useful for implementing mutually recursive algorithms
in a way that won't consume the stack."} boywhoroared.4clojure.p76-intro-to-trampoline-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-76-test
     (testing "Problem 76: The trampoline function takes a function f
and a variable number of parameters.
Trampoline calls f with any parameters that were supplied.
If f returns a function, trampoline
calls that function with no arguments.
This is repeated, until the return value is not a function,
and then trampoline returns that non-function value.
This is useful for implementing mutually recursive algorithms
in a way that won't consume the stack."
       (is (= __
   (letfn
     [(foo [x y] #(bar (conj x y) y))
      (bar [x y] (if (> (last x) 10)
                   x
                   #(foo x (+ 2 y))))]
     (trampoline foo [] 1))))))