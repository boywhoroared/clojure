(ns
 ^{:difficulty "easy", :tags ["math"], :description "Write a function which calculates\nthe least common multiple.\nYour function should accept a variable number\nof positive integers or ratios."} boywhoroared.4clojure.p100-least-common-multiple-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-100-test
 (testing
  "Problem 100: Write a function which calculates\nthe least common multiple.\nYour function should accept a variable number\nof positive integers or ratios."
  (is (== (__ 2 3) 6))
  (is (== (__ 5 3 7) 105))
  (is (== (__ 1/3 2/5) 2))
  (is (== (__ 3/4 1/6) 3/2))
  (is (== (__ 7 5/7 2 3/5) 210))))

