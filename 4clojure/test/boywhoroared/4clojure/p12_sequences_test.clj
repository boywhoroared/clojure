(ns
 boywhoroared.4clojure.p12-sequences-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-12-test
  (testing
   "Problem 12: "
    (is (= __ (first '(3 2 1))))
    (is (= __ (second [2 3 4])))
    (is (= __ (last (list 1 2 3))))))

