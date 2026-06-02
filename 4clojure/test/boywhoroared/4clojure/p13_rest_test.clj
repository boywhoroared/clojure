(ns
 boywhoroared.4clojure.p13-rest-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-13-test
 (testing "Problem 13: " (is (= __ (rest [10 20 30 40])))))

