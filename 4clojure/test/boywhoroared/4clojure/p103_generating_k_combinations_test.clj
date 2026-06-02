(ns
 ^{:difficulty "medium", :tags ["seqs" "combinatorics"], :description "Given a sequence S consisting of n elements\ngenerate all k-combinations of S,\ni.e. generate all possible sets consisting\nof k distinct elements taken from S.\nThe number of k-combinations for a sequence\nis equal to the binomial coefficient."} boywhoroared.4clojure.p103-generating-k-combinations-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-103-test
 (testing
  "Problem 103: Given a sequence S consisting of n elements\ngenerate all k-combinations of S,\ni.e. generate all possible sets consisting\nof k distinct elements taken from S.\nThe number of k-combinations for a sequence\nis equal to the binomial coefficient."
  (is (= (__ 1 #{4 6 5}) #{#{6} #{5} #{4}}))
  (is (= (__ 10 #{4 6 5}) #{}))
  (is (= (__ 2 #{0 1 2}) #{#{0 1} #{1 2} #{0 2}}))
  (is
   (=
    (__ 3 #{0 1 4 3 2})
    #{#{0 4 3}
      #{0 1 4}
      #{4 3 2}
      #{0 1 2}
      #{0 1 3}
      #{1 3 2}
      #{0 3 2}
      #{1 4 3}
      #{1 4 2}
      #{0 4 2}}))
  (is
   (= (__ 4 #{"efg" "abc" [1 2 3] :a}) #{#{"efg" "abc" [1 2 3] :a}}))
  (is
   (=
    (__ 2 #{"efg" "abc" [1 2 3] :a})
    #{#{[1 2 3] :a}
      #{"efg" :a}
      #{"abc" :a}
      #{"abc" [1 2 3]}
      #{"efg" "abc"}
      #{"efg" [1 2 3]}}))))

