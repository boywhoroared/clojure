(ns
 boywhoroared.4clojure.p62-re-implement-iteration-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-62-test
  (testing
   "Problem 62: "
    (is (= (take 5 (__ (fn* [p1__193#] (* 2 p1__193#)) 1)) [1 2 4 8 16]))
    (is (= (take 100 (__ inc 0)) (take 100 (range))))
    (is
     (=
      (take 9 (__ (fn* [p1__194#] (inc (mod p1__194# 3))) 1))
      (take 9 (cycle [1 2 3]))))))

