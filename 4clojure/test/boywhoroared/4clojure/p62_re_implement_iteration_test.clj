(ns
  ^{:id 62 :difficulty "easy" :tags ["seqs" "core-functions"] :description "Given a side-effect free function f
and an initial value x
write a function which returns an infinite lazy sequence
of x, (f x), (f (f x)), (f (f (f x))), etc."} boywhoroared.4clojure.p62-re-implement-iteration-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-62-test
     (testing "Problem 62: Given a side-effect free function f
and an initial value x
write a function which returns an infinite lazy sequence
of x, (f x), (f (f x)), (f (f (f x))), etc."
       (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16]))
(is (= (take 100 (__ inc 0)) (take 100 (range))))
(is (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))))))