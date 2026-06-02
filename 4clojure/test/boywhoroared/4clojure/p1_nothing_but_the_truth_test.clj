(ns
 boywhoroared.4clojure.p1-nothing-but-the-truth-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest problem-1-test (testing "Problem 1: " (is (= __ true))))

