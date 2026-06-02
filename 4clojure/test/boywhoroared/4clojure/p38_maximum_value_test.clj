(ns
 boywhoroared.4clojure.p38-maximum-value-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-38-test
  (testing
   "Problem 38: "
    (is (= (__ 1 8 3 4) 8))
    (is (= (__ 30 20) 30))
    (is (= (__ 45 67 11) 67))))

