(ns
 ^{:difficulty "medium", :tags ["seqs"], :description "Write a function which\nflattens any nested combination of sequential things\n(lists, vectors, etc.),\nbut maintains the lowest level sequential items.\nThe result should be a sequence of sequences\nwith only one level of nesting."} boywhoroared.4clojure.p93-partially-flatten-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-93-test
 (testing
  "Problem 93: Write a function which\nflattens any nested combination of sequential things\n(lists, vectors, etc.),\nbut maintains the lowest level sequential items.\nThe result should be a sequence of sequences\nwith only one level of nesting."
  (is (= (__ [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]))
  (is
   (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]]) [[:a :b] [:c :d] [:e :f]]))
  (is (= (__ '((1 2) ((3 4) ((((5 6))))))) '((1 2) (3 4) (5 6))))))

