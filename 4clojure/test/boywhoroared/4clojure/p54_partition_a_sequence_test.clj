(ns
 boywhoroared.4clojure.p54-partition-a-sequence-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-54-test
  (testing
   "Problem 54: "
    (is (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
    (is (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
    (is (= (__ 3 (range 8)) '((0 1 2) (3 4 5))))))

