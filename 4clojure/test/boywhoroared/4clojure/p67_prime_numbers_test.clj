(ns
 boywhoroared.4clojure.p67-prime-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-67-test
 (testing
  "Problem 67: "
  (is (= (__ 2) [2 3]))
  (is (= (__ 5) [2 3 5 7 11]))
  (is (= (last (__ 100)) 541))))

