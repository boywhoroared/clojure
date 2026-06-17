(ns
  ^{:id 31 :difficulty "easy" :tags ["seqs"] :description "Write a function which
packs consecutive duplicates into sub-lists."} boywhoroared.4clojure.p31-pack-a-sequence-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-31-test
     (testing "Problem 31: Write a function which
packs consecutive duplicates into sub-lists."
       (is (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
(is (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
(is (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))