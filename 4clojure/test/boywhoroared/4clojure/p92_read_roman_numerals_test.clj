(ns
 ^{:difficulty "hard", :tags ["strings" "math"], :description "Roman numerals are easy to recognize,\nbut not everyone knows all the rules necessary to work with them.\nWrite a function to parse a Roman-numeral string\nand return the number it represents.\n\nYou can assume that the input will be well-formed,\nin upper-case, and follow the subtractive principle.\nYou don't need to handle any numbers greater than MMMCMXCIX (3999),\nthe largest number representable with ordinary letters."} boywhoroared.4clojure.p92-read-roman-numerals-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-92-test
 (testing
  "Problem 92: Roman numerals are easy to recognize,\nbut not everyone knows all the rules necessary to work with them.\nWrite a function to parse a Roman-numeral string\nand return the number it represents.\n\nYou can assume that the input will be well-formed,\nin upper-case, and follow the subtractive principle.\nYou don't need to handle any numbers greater than MMMCMXCIX (3999),\nthe largest number representable with ordinary letters."
  (is (= 14 (__ "XIV")))
  (is (= 827 (__ "DCCCXXVII")))
  (is (= 3999 (__ "MMMCMXCIX")))
  (is (= 48 (__ "XLVIII")))))

