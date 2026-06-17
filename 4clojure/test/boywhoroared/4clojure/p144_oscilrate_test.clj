(ns
  ^{:id 144 :difficulty "medium" :tags ["sequences"] :description "Write an oscillating iterate: a function that takes
an initial value and a variable number of functions. It should return
a lazy sequence of the functions applied to the value in order, restarting
from the first function after it hits the end."} boywhoroared.4clojure.p144-oscilrate-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-144-test
     (testing "Problem 144: Write an oscillating iterate: a function that takes
an initial value and a variable number of functions. It should return
a lazy sequence of the functions applied to the value in order, restarting
from the first function after it hits the end."
       (is (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
(is (= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]))
(is (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]))))