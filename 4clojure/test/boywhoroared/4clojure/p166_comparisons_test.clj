(ns
 ^{:difficulty "easy", :tags [], :description "For any orderable data type it's possible to derive all of the\nbasic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any\noperator but = or ≠ will work). Write a function that takes three arguments, a\nless than operator for the data and two items to compare. The function should\nreturn a keyword describing the relationship between the two items. The keywords\nfor the relationship between x and y are as follows:\n\n  x = y → :eq\n  x > y → :gt\n  x < y → :lt"} boywhoroared.4clojure.p166-comparisons-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-166-test
 (testing
  "Problem 166: For any orderable data type it's possible to derive all of the\nbasic comparison operations (<, ≤, =, ≠, ≥, and >) from a single operation (any\noperator but = or ≠ will work). Write a function that takes three arguments, a\nless than operator for the data and two items to compare. The function should\nreturn a keyword describing the relationship between the two items. The keywords\nfor the relationship between x and y are as follows:\n\n  x = y → :eq\n  x > y → :gt\n  x < y → :lt"
  (is (= :gt (__ < 5 1)))
  (is (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum")))
  (is (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
  (is (= :gt (__ > 0 2)))))

