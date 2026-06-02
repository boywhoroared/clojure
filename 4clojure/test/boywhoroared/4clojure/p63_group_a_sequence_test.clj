(ns
 boywhoroared.4clojure.p63-group-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-63-test
 (testing
  "Problem 63: "
  (is
   (=
    (__ (fn* [p1__195#] (> p1__195# 5)) #{1 6 3 8})
    {false [1 3], true [6 8]}))
  (is
   (=
    (__ (fn* [p1__196#] (apply / p1__196#)) [[1 2] [2 4] [4 6] [3 6]])
    {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}))
  (is
   (=
    (__ count [[1] [1 2] [3] [1 2 3] [2 3]])
    {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}))))

