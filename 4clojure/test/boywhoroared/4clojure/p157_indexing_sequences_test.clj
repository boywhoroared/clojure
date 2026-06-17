(ns
  ^{:id 157 :difficulty "easy" :tags ["seqs"] :description "Transform a sequence into a sequence of pairs containing the original
elements along with their index."} boywhoroared.4clojure.p157-indexing-sequences-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-157-test
     (testing "Problem 157: Transform a sequence into a sequence of pairs containing the original
elements along with their index."
       (is (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
(is (= (__ [0 1 3]) '((0 0) (1 1) (3 2))))
(is (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]))))