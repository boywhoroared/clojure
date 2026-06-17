(ns
  ^{:id 68 :difficulty "elementary" :tags ["recursion"] :description "Clojure only has one
non-stack-consuming looping construct: recur.
Either a function or a loop can be used as the recursion point.
Either way, recur rebinds the bindings
of the recursion point to the values it is passed.
Recur must be called from the tail-position,
and calling it elsewhere will result in an error."} boywhoroared.4clojure.p68-recurring-theme-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-68-test
     (testing "Problem 68: Clojure only has one
non-stack-consuming looping construct: recur.
Either a function or a loop can be used as the recursion point.
Either way, recur rebinds the bindings
of the recursion point to the values it is passed.
Recur must be called from the tail-position,
and calling it elsewhere will result in an error."
       (is (= __
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result))))))