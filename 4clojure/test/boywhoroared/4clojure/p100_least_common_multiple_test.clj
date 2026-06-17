(ns
  ^{:id 100 :difficulty "easy" :tags ["math"] :description "Write a function which calculates
the least common multiple.
Your function should accept a variable number
of positive integers or ratios."} boywhoroared.4clojure.p100-least-common-multiple-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-100-test
     (testing "Problem 100: Write a function which calculates
the least common multiple.
Your function should accept a variable number
of positive integers or ratios."
       (is (== (__ 2 3) 6))
(is (== (__ 5 3 7) 105))
(is (== (__ 1/3 2/5) 2))
(is (== (__ 3/4 1/6) 3/2))
(is (== (__ 7 5/7 2 3/5) 210))))