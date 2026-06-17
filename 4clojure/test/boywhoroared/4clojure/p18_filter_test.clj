(ns
  ^{:id 18 :difficulty "elementary" :tags [] :description "The filter function takes two arguments:
a predicate function (f) and a sequence (s).
Filter returns a new sequence consisting
of all the items of s for which (f item) returns true."} boywhoroared.4clojure.p18-filter-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-18-test
     (testing "Problem 18: The filter function takes two arguments:
a predicate function (f) and a sequence (s).
Filter returns a new sequence consisting
of all the items of s for which (f item) returns true."
       (is (= __ (filter #(> % 5) '(3 4 5 6 7))))))