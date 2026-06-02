(ns
 boywhoroared.4clojure.p157-indexing-sequences-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-157-test
  (testing
   "Problem 157: "
    (is (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
    (is (= (__ [0 1 3]) '((0 0) (1 1) (3 2))))
    (is (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]))))

