(ns
 ^{:difficulty "hard", :tags ["seqs"], :description "Given a vector of integers,\nfind the longest consecutive sub-sequence of increasing numbers.\nIf two sub-sequences have the same length,\nuse the one that occurs first.\nAn increasing sub-sequence must have\na length of 2 or greater to qualify."} boywhoroared.4clojure.p53-longest-increasing-sub-seq-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-53-test
 (testing
  "Problem 53: Given a vector of integers,\nfind the longest consecutive sub-sequence of increasing numbers.\nIf two sub-sequences have the same length,\nuse the one that occurs first.\nAn increasing sub-sequence must have\na length of 2 or greater to qualify."
  (is (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3]))
  (is (= (__ [5 6 1 3 2 7]) [5 6]))
  (is (= (__ [2 3 3 4 5]) [3 4 5]))
  (is (= (__ [7 6 5 4]) []))))

