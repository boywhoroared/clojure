(ns
 ^{:difficulty "medium", :tags ["sequences"], :description "Write an oscillating iterate: a function that takes\nan initial value and a variable number of functions. It should return\na lazy sequence of the functions applied to the value in order, restarting\nfrom the first function after it hits the end."} boywhoroared.4clojure.p144-oscilrate-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-144-test
 (testing
  "Problem 144: Write an oscillating iterate: a function that takes\nan initial value and a variable number of functions. It should return\na lazy sequence of the functions applied to the value in order, restarting\nfrom the first function after it hits the end."
  (is (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
  (is
   (=
    (take
     5
     (__
      3
      (fn* [p1__206#] (- p1__206# 3))
      (fn* [p1__207#] (+ 5 p1__207#))))
    [3 0 5 2 7]))
  (is
   (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]))))

