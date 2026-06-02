(ns
 ^{:difficulty "easy", :tags ["seqs" "core-functions"], :description "Write a function which returns\nthe total number of elements in a sequence."} boywhoroared.4clojure.p22-count-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-22-test
 (testing
  "Problem 22: Write a function which returns\nthe total number of elements in a sequence."
  (is (= (__ '(1 2 3 3 1)) 5))
  (is (= (__ "Hello World") 11))
  (is (= (__ [[1 2] [3 4] [5 6]]) 3))
  (is (= (__ '(13)) 1))
  (is (= (__ '(:a :b :c)) 3))))

