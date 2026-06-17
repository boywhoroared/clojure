(ns
  ^{:id 58 :difficulty "medium" :tags ["higher-order-functions" "core-functions"] :description "Write a function which
allows you to create function compositions.
The parameter list should take a variable number of functions,
and create a function applies them from right-to-left."} boywhoroared.4clojure.p58-function-composition-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-58-test
     (testing "Problem 58: Write a function which
allows you to create function compositions.
The parameter list should take a variable number of functions,
and create a function applies them from right-to-left."
       (is (= [3 2 1] ((__ rest reverse) [1 2 3 4])))
(is (= 5 ((__ (partial + 3) second) [1 2 3 4])))
(is (= true ((__ zero? #(mod % 8) +) 3 5 7 9)))
(is (= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world")))))