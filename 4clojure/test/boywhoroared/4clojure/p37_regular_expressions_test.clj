(ns
 boywhoroared.4clojure.p37-regular-expressions-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-37-test
  (testing
   "Problem 37: "
    (is (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))))

