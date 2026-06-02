(ns
 ^{:difficulty "easy", :tags ["higher-order-functions" "math"], :description "Lexical scope and first-class functions\nare two of the most basic building blocks\nof a functional language like Clojure.\nWhen you combine the two together,\nyou get something very powerful called lexical closures.\nWith these, you can exercise a great deal\nof control over the lifetime of your local bindings,\nsaving their values for use later,\nlong after the code you're running now has finished.\n\nIt can be hard to follow in the abstract,\nso let's build a simple closure.\nGiven a positive integer n,\nreturn a function (f x) which computes xn.\nObserve that the effect of this is to preserve the value of n\nfor use outside the scope in which it is defined.\n"} boywhoroared.4clojure.p107-simple-closures-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-107-test
 (testing
  "Problem 107: Lexical scope and first-class functions\nare two of the most basic building blocks\nof a functional language like Clojure.\nWhen you combine the two together,\nyou get something very powerful called lexical closures.\nWith these, you can exercise a great deal\nof control over the lifetime of your local bindings,\nsaving their values for use later,\nlong after the code you're running now has finished.\n\nIt can be hard to follow in the abstract,\nso let's build a simple closure.\nGiven a positive integer n,\nreturn a function (f x) which computes xn.\nObserve that the effect of this is to preserve the value of n\nfor use outside the scope in which it is defined.\n"
  (is (= 256 ((__ 2) 16) ((__ 8) 2)))
  (is (= [1 8 27 64] (map (__ 3) [1 2 3 4])))
  (is
   (=
    [1 2 4 8 16]
    (map (fn* [p1__199#] ((__ p1__199#) 2)) [0 1 2 3 4])))))

