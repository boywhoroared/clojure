(ns
 boywhoroared.4clojure.p104-write-roman-numerals-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-104-test
 (testing
  "Problem 104: "
  (is (= "I" (__ 1)))
  (is (= "I" (__ 1)))
  (is (= "XXX" (__ 30)))
  (is (= "IV" (__ 4)))
  (is (= "CXL" (__ 140)))
  (is (= "DCCCXXVII" (__ 827)))
  (is (= "MMMCMXCIX" (__ 3999)))
  (is (= "XLVIII" (__ 48)))))

