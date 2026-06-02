(ns
 ^{:difficulty "medium", :tags ["seqs"], :description "Write a function that returns\na lazy sequence of \"pronunciations\" of a sequence of numbers.\nA pronunciation of each element in the sequence\nconsists of the number of repeating identical numbers\nand the number itself.\nFor example, [1 1] is pronounced as [2 1] (\"two ones\"),\nwhich in turn is pronounced as [1 2 1 1] (\"one two, one one\") .\nYour function should accept an initial sequence of numbers,\nand return an infinite lazy sequence of pronunciations,\neach element being a pronunciation of the previous element."} boywhoroared.4clojure.p110-sequence-of-pronunciations-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-110-test
 (testing
  "Problem 110: Write a function that returns\na lazy sequence of \"pronunciations\" of a sequence of numbers.\nA pronunciation of each element in the sequence\nconsists of the number of repeating identical numbers\nand the number itself.\nFor example, [1 1] is pronounced as [2 1] (\"two ones\"),\nwhich in turn is pronounced as [1 2 1 1] (\"one two, one one\") .\nYour function should accept an initial sequence of numbers,\nand return an infinite lazy sequence of pronunciations,\neach element being a pronunciation of the previous element."
  (is (= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1]))))
  (is (= [3 1 2 4] (first (__ [1 1 1 4 4]))))
  (is (= [1 1 1 3 2 1 3 2 1 1] (nth (__ [1]) 6)))
  (is (= 338 (count (nth (__ [3 2]) 15))))))

