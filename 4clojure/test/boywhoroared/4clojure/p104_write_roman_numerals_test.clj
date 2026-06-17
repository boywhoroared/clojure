(ns
  ^{:id 104 :difficulty "medium" :tags ["strings" "math"] :description "This is the inverse of Problem 92, but much easier.
Given an integer smaller than 4000,
return the corresponding roman numeral in uppercase,
adhering to the subtractive principle."} boywhoroared.4clojure.p104-write-roman-numerals-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-104-test
     (testing "Problem 104: This is the inverse of Problem 92, but much easier.
Given an integer smaller than 4000,
return the corresponding roman numeral in uppercase,
adhering to the subtractive principle."
       (is (= "I" (__ 1)))
(is (= "I" (__ 1)))
(is (= "XXX" (__ 30)))
(is (= "IV" (__ 4)))
(is (= "CXL" (__ 140)))
(is (= "DCCCXXVII" (__ 827)))
(is (= "MMMCMXCIX" (__ 3999)))
(is (= "XLVIII" (__ 48)))))