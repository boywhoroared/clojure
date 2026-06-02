(ns
 boywhoroared.4clojure.p17-map-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-17-test
 (testing
  "Problem 17: "
  (is (= __ (map (fn* [p1__185#] (+ p1__185# 5)) '(1 2 3))))))

