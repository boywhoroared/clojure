(ns
 boywhoroared.4clojure.p2-simple-math-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-2-test
 (testing "Problem 2: " (is (= (- 10 (* 2 3)) __))))

