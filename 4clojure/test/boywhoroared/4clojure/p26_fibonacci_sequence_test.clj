(ns
 boywhoroared.4clojure.p26-fibonacci-sequence-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-26-test
  (testing
   "Problem 26: "
    (is (= (__ 3) '(1 1 2)))
    (is (= (__ 6) '(1 1 2 3 5 8)))
    (is (= (__ 8) '(1 1 2 3 5 8 13 21)))))

