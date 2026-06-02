(ns
 ^{:difficulty "elementary", :tags ["recursion"], :description "Clojure only has one\nnon-stack-consuming looping construct: recur.\nEither a function or a loop can be used as the recursion point.\nEither way, recur rebinds the bindings\nof the recursion point to the values it is passed.\nRecur must be called from the tail-position,\nand calling it elsewhere will result in an error."} boywhoroared.4clojure.p68-recurring-theme-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-68-test
 (testing
  "Problem 68: Clojure only has one\nnon-stack-consuming looping construct: recur.\nEither a function or a loop can be used as the recursion point.\nEither way, recur rebinds the bindings\nof the recursion point to the values it is passed.\nRecur must be called from the tail-position,\nand calling it elsewhere will result in an error."
  (is
   (=
    __
    (loop
     [x 5 result []]
     (if (> x 0) (recur (dec x) (conj result (+ 2 x))) result))))))

