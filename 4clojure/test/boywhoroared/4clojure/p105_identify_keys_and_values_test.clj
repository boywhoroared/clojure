(ns
 ^{:difficulty "medium", :tags ["maps" "seqs"], :description "Given an input sequence of keywords and numbers,\ncreate a map such that each key in the map is a keyword,\nand the value is a sequence of all the numbers (if any)\nbetween it and the next keyword in the sequence."} boywhoroared.4clojure.p105-identify-keys-and-values-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-105-test
 (testing
  "Problem 105: Given an input sequence of keywords and numbers,\ncreate a map such that each key in the map is a keyword,\nand the value is a sequence of all the numbers (if any)\nbetween it and the next keyword in the sequence."
  (is (= {} (__ [])))
  (is (= {:a [1]} (__ [:a 1])))
  (is (= {:a [1], :b [2]} (__ [:a 1 :b 2])))
  (is (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4])))))

