(ns
 ^{:difficulty "easy", :tags ["seqs" "core-functions"], :description "Write a function which returns\nthe last element in a sequence."} boywhoroared.4clojure.p19-last-element-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-19-test
 (testing
  "Problem 19: Write a function which returns\nthe last element in a sequence."
  (is (= (__ [1 2 3 4 5]) 5))
  (is (= (__ '(5 4 3)) 3))
  (is (= (__ ["b" "c" "d"]) "d"))))

