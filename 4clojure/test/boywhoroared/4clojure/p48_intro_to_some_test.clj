(ns
 ^{:difficulty "easy", :tags [], :description "The some function takes\na predicate function and a collection.\nIt returns the first logical true value of (predicate x)\nwhere x is an item in the collection."} boywhoroared.4clojure.p48-intro-to-some-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-48-test
 (testing
  "Problem 48: The some function takes\na predicate function and a collection.\nIt returns the first logical true value of (predicate x)\nwhere x is an item in the collection."
  (is (= __ (some #{7 6 2} [5 6 7 8])))
  (is
   (=
    __
    (some
     (fn* [p1__188#] (when (even? p1__188#) p1__188#))
     [5 6 7 8])))))

