(ns
  ^{:id 135 :difficulty "easy" :tags ["higher-order-functions" "math"] :description "Your friend Joe is always whining about Lisps using the prefix
notation for math. Show him how you could easily write a function that does math
using the infix notation. Is your favorite language that flexible, Joe? Write a
function that accepts a variable length mathematical expression consisting of
numbers and the operations +, -, *, and /. Assume a simple calculator that does
not do precedence and instead just calculates left to right."} boywhoroared.4clojure.p135-infix-calculator-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-135-test
     (testing "Problem 135: Your friend Joe is always whining about Lisps using the prefix
notation for math. Show him how you could easily write a function that does math
using the infix notation. Is your favorite language that flexible, Joe? Write a
function that accepts a variable length mathematical expression consisting of
numbers and the operations +, -, *, and /. Assume a simple calculator that does
not do precedence and instead just calculates left to right."
       (is (= 7  (__ 2 + 5)))
(is (= 42 (__ 38 + 48 - 2 / 2)))
(is (= 8  (__ 10 / 2 - 1 * 2)))
(is (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9)))))