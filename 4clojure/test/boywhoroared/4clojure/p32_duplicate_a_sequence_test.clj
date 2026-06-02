(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "Write a function which\nduplicates each element of a sequence."} boywhoroared.4clojure.p32-duplicate-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-32-test
 (testing
  "Problem 32: Write a function which\nduplicates each element of a sequence."
  (is (= (__ [1 2 3]) '(1 1 2 2 3 3)))
  (is (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
  (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
  (is (= (__ [44 33]) [44 44 33 33]))))

