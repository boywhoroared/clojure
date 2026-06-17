(ns
  ^{:id 53 :difficulty "hard" :tags ["seqs"] :description "Given a vector of integers,
find the longest consecutive sub-sequence of increasing numbers.
If two sub-sequences have the same length,
use the one that occurs first.
An increasing sub-sequence must have
a length of 2 or greater to qualify."} boywhoroared.4clojure.p53-longest-increasing-sub-seq-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-53-test
     (testing "Problem 53: Given a vector of integers,
find the longest consecutive sub-sequence of increasing numbers.
If two sub-sequences have the same length,
use the one that occurs first.
An increasing sub-sequence must have
a length of 2 or greater to qualify."
       (is (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3]))
(is (= (__ [5 6 1 3 2 7]) [5 6]))
(is (= (__ [2 3 3 4 5]) [3 4 5]))
(is (= (__ [7 6 5 4]) []))))