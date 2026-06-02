(ns
 ^{:difficulty "medium", :tags [], :description "A number is \"perfect\" if the sum of its divisors\nequal the number itself.\n6 is a perfect number because 1+2+3=6.\nWrite a function which returns true for perfect numbers\nand false otherwise."} boywhoroared.4clojure.p80-perfect-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-80-test
 (testing
  "Problem 80: A number is \"perfect\" if the sum of its divisors\nequal the number itself.\n6 is a perfect number because 1+2+3=6.\nWrite a function which returns true for perfect numbers\nand false otherwise."
  (is (= (__ 6) true))
  (is (= (__ 7) false))
  (is (= (__ 496) true))
  (is (= (__ 500) false))
  (is (= (__ 8128) true))))

