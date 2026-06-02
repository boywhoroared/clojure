(ns
 boywhoroared.4clojure.p25-find-the-odd-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-25-test
 (testing
  "Problem 25: "
  (is (= (__ #{1 4 3 2 5}) '(1 3 5)))
  (is (= (__ [4 2 1 6]) '(1)))
  (is (= (__ [2 2 4 6]) '()))
  (is (= (__ [1 1 1 3]) '(1 1 1 3)))))

