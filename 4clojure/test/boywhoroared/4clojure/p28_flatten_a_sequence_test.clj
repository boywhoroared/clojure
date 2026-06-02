(ns
 ^{:difficulty "easy", :tags ["seqs" "core-functions"], :description "Write a function which flattens a sequence."} boywhoroared.4clojure.p28-flatten-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-28-test
 (testing
  "Problem 28: Write a function which flattens a sequence."
  (is (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
  (is (= (__ ["a" ["b"] "c"]) '("a" "b" "c")))
  (is (= (__ '((((:a))))) '(:a)))))

