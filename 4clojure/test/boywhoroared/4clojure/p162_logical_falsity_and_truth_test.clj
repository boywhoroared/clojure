(ns
 boywhoroared.4clojure.p162-logical-falsity-and-truth-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-162-test
  (testing
   "Problem 162: "
    (is (= __ (if-not false 1 0)))
    (is (= __ (if-not nil 1 0)))
    (is (= __ (if true 1 0)))
    (is (= __ (if [] 1 0)))
    (is (= __ (if [0] 1 0)))
    (is (= __ (if 0 1 0)))
    (is (= __ (if 1 1 0)))))

