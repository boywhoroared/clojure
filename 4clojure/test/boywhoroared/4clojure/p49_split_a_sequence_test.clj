(ns
 boywhoroared.4clojure.p49-split-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-49-test
 (testing
  "Problem 49: "
  (is (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
  (is (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
  (is (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))

