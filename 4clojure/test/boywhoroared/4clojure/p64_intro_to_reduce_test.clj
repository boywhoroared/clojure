(ns
 ^{:difficulty "elementary", :tags ["seqs"], :description "Reduce takes a 2 argument function\nand an optional starting value.\nIt then applies the function to the first 2 items in the sequence\n(or the starting value and the first element of the sequence).\nIn the next iteration the function will be called on\nthe previous return value and the next item from the sequence,\nthus reducing the entire collection to one value.\nDon't worry, it's not as complicated as it sounds."} boywhoroared.4clojure.p64-intro-to-reduce-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-64-test
 (testing
  "Problem 64: Reduce takes a 2 argument function\nand an optional starting value.\nIt then applies the function to the first 2 items in the sequence\n(or the starting value and the first element of the sequence).\nIn the next iteration the function will be called on\nthe previous return value and the next item from the sequence,\nthus reducing the entire collection to one value.\nDon't worry, it's not as complicated as it sounds."
  (is (= 15 (reduce __ [1 2 3 4 5])))
  (is (= 0 (reduce __ [])))
  (is (= 6 (reduce __ 1 [2 3])))))

