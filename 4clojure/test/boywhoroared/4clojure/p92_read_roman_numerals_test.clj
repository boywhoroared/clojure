(ns
 boywhoroared.4clojure.p92-read-roman-numerals-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-92-test
  (testing
   "Problem 92: "
    (is (= 14 (__ "XIV")))
    (is (= 827 (__ "DCCCXXVII")))
    (is (= 3999 (__ "MMMCMXCIX")))
    (is (= 48 (__ "XLVIII")))))

