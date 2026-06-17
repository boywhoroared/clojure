(ns
  ^{:id 75 :difficulty "medium" :tags [] :description "Two numbers are coprime if their
greatest common divisor equals 1.
Euler's totient function f(x) is defined as
the number of positive integers less than x which are coprime to x.
The special case f(1) equals 1.
Write a function which calculates Euler's totient function."} boywhoroared.4clojure.p75-eulers-totient-function-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-75-test
     (testing "Problem 75: Two numbers are coprime if their
greatest common divisor equals 1.
Euler's totient function f(x) is defined as
the number of positive integers less than x which are coprime to x.
The special case f(1) equals 1.
Write a function which calculates Euler's totient function."
       (is (= (__ 1) 1))
(is (= (__ 10) (count '(1 3 7 9)) 4))
(is (= (__ 40) 16))
(is (= (__ 99) 60))))