(ns
  ^{:id 49 :difficulty "easy" :tags ["seqs" "core-functions"] :description "Write a function which will
split a sequence into two parts."} boywhoroared.4clojure.p49-split-a-sequence-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-49-test
     (testing "Problem 49: Write a function which will
split a sequence into two parts."
       (is (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
(is (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
(is (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))