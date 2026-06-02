(ns
 boywhoroared.4clojure.p52-intro-to-destructuring-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-52-test
 (testing
  "Problem 52: "
  (is (= [2 4] (let [[a b c d e f g] (range)] __)))))

