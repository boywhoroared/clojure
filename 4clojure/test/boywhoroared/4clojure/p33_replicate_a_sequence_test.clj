(ns
  ^{:id 33 :difficulty "easy" :tags ["seqs"] :description "Write a function which replicates each
element of a sequence a variable number of times."} boywhoroared.4clojure.p33-replicate-a-sequence-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-33-test
     (testing "Problem 33: Write a function which replicates each
element of a sequence a variable number of times."
       (is (= (__ [1 2 3] 2) '(1 1 2 2 3 3)))
(is (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
(is (= (__ [4 5 6] 1) '(4 5 6)))
(is (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
(is (= (__ [44 33] 2) [44 44 33 33]))))