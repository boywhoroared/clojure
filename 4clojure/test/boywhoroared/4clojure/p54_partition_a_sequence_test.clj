(ns
 ^{:difficulty "medium", :tags ["seqs" "core-functions"], :description "Write a function which returns\na sequence of lists of x items each.\nLists of less than x items should not be returned."} boywhoroared.4clojure.p54-partition-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-54-test
 (testing
  "Problem 54: Write a function which returns\na sequence of lists of x items each.\nLists of less than x items should not be returned."
  (is (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
  (is (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
  (is (= (__ 3 (range 8)) '((0 1 2) (3 4 5))))))

