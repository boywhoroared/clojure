(ns
  ^{:id 166 :difficulty "easy" :tags [] :description "For any orderable data type it's possible to derive all of the
basic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any
operator but = or ≠ will work). Write a function that takes three arguments, a
less than operator for the data and two items to compare. The function should
return a keyword describing the relationship between the two items. The keywords
for the relationship between x and y are as follows:

  x = y → :eq
  x > y → :gt
  x < y → :lt"} boywhoroared.4clojure.p166-comparisons-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-166-test
     (testing "Problem 166: For any orderable data type it's possible to derive all of the
basic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any
operator but = or ≠ will work). Write a function that takes three arguments, a
less than operator for the data and two items to compare. The function should
return a keyword describing the relationship between the two items. The keywords
for the relationship between x and y are as follows:

  x = y → :eq
  x > y → :gt
  x < y → :lt"
       (is (= :gt (__ < 5 1)))
(is (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum")))
(is (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
(is (= :gt (__ > 0 2)))))