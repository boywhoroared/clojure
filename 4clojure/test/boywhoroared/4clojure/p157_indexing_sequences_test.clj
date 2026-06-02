(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "Transform a sequence into a sequence of pairs containing the original\nelements along with their index."} boywhoroared.4clojure.p157-indexing-sequences-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-157-test
 (testing
  "Problem 157: Transform a sequence into a sequence of pairs containing the original\nelements along with their index."
  (is (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
  (is (= (__ [0 1 3]) '((0 0) (1 1) (3 2))))
  (is (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]))))

