(ns
 boywhoroared.4clojure.p7-conj-on-vectors-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-7-test
  (testing
   "Problem 7: "
    (is (= __ (conj [1 2 3] 4)))
    (is (= __ (conj [1 2] 3 4)))))

