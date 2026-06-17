(ns
  ^{:id 20 :difficulty "easy" :tags ["seqs"] :description "Write a function which returns
the second to last element from a sequence."} boywhoroared.4clojure.p20-penultimate-element-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-20-test
     (testing "Problem 20: Write a function which returns
the second to last element from a sequence."
       (is (= (__ (list 1 2 3 4 5)) 4))
(is (= (__ ["a" "b" "c"]) "b"))
(is (= (__ [[1 2] [3 4]]) [1 2]))))