(ns
 ^{:difficulty "easy", :tags ["core-functions"], :description "Given a function f and a sequence s,\nwrite a function which returns a map.\nThe keys should be the values of f applied to each item in s.\nThe value at each key should be a vector\nof corresponding items in the order they appear in s."} boywhoroared.4clojure.p63-group-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-63-test
 (testing
  "Problem 63: Given a function f and a sequence s,\nwrite a function which returns a map.\nThe keys should be the values of f applied to each item in s.\nThe value at each key should be a vector\nof corresponding items in the order they appear in s."
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

