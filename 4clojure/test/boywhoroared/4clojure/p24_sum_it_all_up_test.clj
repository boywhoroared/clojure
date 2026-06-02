(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "Write a function which returns\nthe sum of a sequence of numbers."} boywhoroared.4clojure.p24-sum-it-all-up-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-24-test
 (testing
  "Problem 24: Write a function which returns\nthe sum of a sequence of numbers."
  (is (= (__ [1 2 3]) 6))
  (is (= (__ (list 0 -2 5 5)) 8))
  (is (= (__ #{1 4 2}) 7))
  (is (= (__ '(0 0 -1)) -1))
  (is (= (__ '(1 10 3)) 14))))

