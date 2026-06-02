(ns
 boywhoroared.4clojure.p86-happy-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-86-test
 (testing
  "Problem 86: "
  (is (= (__ 7) true))
  (is (= (__ 986543210) true))
  (is (= (__ 2) false))
  (is (= (__ 3) false))))

