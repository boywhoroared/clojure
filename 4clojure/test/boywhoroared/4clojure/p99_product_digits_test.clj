(ns
 ^{:difficulty "easy", :tags ["math" "seqs"], :description "Write a function which multiplies two numbers\nand returns the result as a sequence of its digits."} boywhoroared.4clojure.p99-product-digits-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-99-test
 (testing
  "Problem 99: Write a function which multiplies two numbers\nand returns the result as a sequence of its digits."
  (is (= (__ 1 1) [1]))
  (is (= (__ 99 9) [8 9 1]))
  (is (= (__ 999 99) [9 8 9 0 1]))))

