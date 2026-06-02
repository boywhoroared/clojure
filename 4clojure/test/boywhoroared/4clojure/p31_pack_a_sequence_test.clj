(ns
 boywhoroared.4clojure.p31-pack-a-sequence-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-31-test
 (testing
  "Problem 31: "
  (is (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
  (is (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
  (is (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))

