(ns
 boywhoroared.4clojure.p80-perfect-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-80-test
 (testing
  "Problem 80: "
  (is (= (__ 6) true))
  (is (= (__ 7) false))
  (is (= (__ 496) true))
  (is (= (__ 500) false))
  (is (= (__ 8128) true))))

