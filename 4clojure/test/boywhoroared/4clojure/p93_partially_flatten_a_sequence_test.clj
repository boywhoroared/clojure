(ns
  ^{:id 93 :difficulty "medium" :tags ["seqs"] :description "Write a function which
flattens any nested combination of sequential things
(lists, vectors, etc.),
but maintains the lowest level sequential items.
The result should be a sequence of sequences
with only one level of nesting."} boywhoroared.4clojure.p93-partially-flatten-a-sequence-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-93-test
     (testing "Problem 93: Write a function which
flattens any nested combination of sequential things
(lists, vectors, etc.),
but maintains the lowest level sequential items.
The result should be a sequence of sequences
with only one level of nesting."
       (is (= (__ [["Do"] ["Nothing"]])
   [["Do"] ["Nothing"]]))
(is (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]])
   [[:a :b] [:c :d] [:e :f]]))
(is (= (__ '((1 2)((3 4)((((5 6)))))))
   '((1 2)(3 4)(5 6))))))