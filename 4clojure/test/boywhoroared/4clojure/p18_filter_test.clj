(ns
 ^{:difficulty "elementary", :tags [], :description "The filter function takes two arguments:\na predicate function (f) and a sequence (s).\nFilter returns a new sequence consisting\nof all the items of s for which (f item) returns true."} boywhoroared.4clojure.p18-filter-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-18-test
 (testing
  "Problem 18: The filter function takes two arguments:\na predicate function (f) and a sequence (s).\nFilter returns a new sequence consisting\nof all the items of s for which (f item) returns true."
  (is (= __ (filter (fn* [p1__186#] (> p1__186# 5)) '(3 4 5 6 7))))))

