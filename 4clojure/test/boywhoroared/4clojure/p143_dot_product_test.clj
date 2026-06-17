(ns
  ^{:id 143 :difficulty "easy" :tags ["seqs" "math"] :description "Create a function that computes the dot product of two sequences.
You may assume that the vectors will have the same length."} boywhoroared.4clojure.p143-dot-product-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-143-test
     (testing "Problem 143: Create a function that computes the dot product of two sequences.
You may assume that the vectors will have the same length."
       (is (= 0 (__ [0 1 0] [1 0 0])))
(is (= 3 (__ [1 1 1] [1 1 1])))
(is (= 32 (__ [1 2 3] [4 5 6])))
(is (= 256 (__ [2 5 6] [100 10 1])))))