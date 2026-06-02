(ns
 ^{:difficulty "medium", :tags ["strings" "math"], :description "This is the inverse of Problem 92, but much easier.\nGiven an integer smaller than 4000,\nreturn the corresponding roman numeral in uppercase,\nadhering to the subtractive principle."} boywhoroared.4clojure.p104-write-roman-numerals-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-104-test
 (testing
  "Problem 104: This is the inverse of Problem 92, but much easier.\nGiven an integer smaller than 4000,\nreturn the corresponding roman numeral in uppercase,\nadhering to the subtractive principle."
  (is (= "I" (__ 1)))
  (is (= "I" (__ 1)))
  (is (= "XXX" (__ 30)))
  (is (= "IV" (__ 4)))
  (is (= "CXL" (__ 140)))
  (is (= "DCCCXXVII" (__ 827)))
  (is (= "MMMCMXCIX" (__ 3999)))
  (is (= "XLVIII" (__ 48)))))

