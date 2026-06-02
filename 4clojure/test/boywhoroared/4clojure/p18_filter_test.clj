(ns boywhoroared.4clojure.p18-filter-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-18-test
  (testing
   "Problem 18: "
    (is (= __ (filter (fn* [p1__186#] (> p1__186# 5)) '(3 4 5 6 7))))))

