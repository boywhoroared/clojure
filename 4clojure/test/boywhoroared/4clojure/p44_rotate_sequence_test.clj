(ns
 ^{:difficulty "medium", :tags ["seqs"], :description "Write a function which\ncan rotate a sequence in either direction."} boywhoroared.4clojure.p44-rotate-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-44-test
 (testing
  "Problem 44: Write a function which\ncan rotate a sequence in either direction."
  (is (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2)))
  (is (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3)))
  (is (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1)))
  (is (= (__ 1 '(:a :b :c)) '(:b :c :a)))
  (is (= (__ -4 '(:a :b :c)) '(:c :a :b)))))

