(ns
 ^{:difficulty "medium", :tags ["math"], :description "Given a variable number of sets of integers, create\na function which returns true iff all of the sets have a non-empty\nsubset with an equivalent summation."} boywhoroared.4clojure.p131-sum-some-set-subsets-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-131-test
 (testing
  "Problem 131: Given a variable number of sets of integers, create\na function which returns true iff all of the sets have a non-empty\nsubset with an equivalent summation."
  (is (= true (__ #{1 -1 99} #{888 -2 2} #{-3 7777 3})))
  (is (= false (__ #{1} #{2} #{3} #{4})))
  (is (= true (__ #{1})))
  (is (= false (__ #{1 -3 51 9} #{0} #{33 2 9 81})))
  (is (= true (__ #{1 3 5} #{4 11 9} #{-3 3 12} #{-2 4 -3 10})))
  (is (= false (__ #{-4 -2 -1 -6 -3 -5} #{7 1 4 6 3 2 9 5 8})))
  (is (= true (__ #{7 1 3 5} #{4 6 2 8})))
  (is
   (=
    true
    (__
     #{7 -1 15 3 11 -9 -13 -5}
     #{1 13 -3 -15 -7 -11 9 5}
     #{-4 1 -2 4 -1 -8 2 8})))
  (is
   (=
    true
    (__ #{-4 7 1 -2 -8 -6 3 9 5 -10} #{4 -1 -3 6 2 -7 -9 10 -5 8})))))

