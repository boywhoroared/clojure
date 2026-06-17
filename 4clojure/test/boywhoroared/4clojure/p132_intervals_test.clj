(ns
  ^{:id 132 :difficulty "medium" :tags ["seqs" "core-functions"] :description "Write a function that takes a two-argument predicate,
a value, and a collection; and returns a new collection where the value
is inserted between every two items that satisfy the predicate."} boywhoroared.4clojure.p132-intervals-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-132-test
     (testing "Problem 132: Write a function that takes a two-argument predicate,
a value, and a collection; and returns a new collection where the value
is inserted between every two items that satisfy the predicate."
       (is (= '(1 :less 6 :less 7 4 3) (__ < :less [1 6 7 4 3])))
(is (= '(2) (__ > :more [2])))
(is (= [0 1 :x 2 :x 3 :x 4]  (__ #(and (pos? %) (< % %2)) :x (range 5))))
(is (empty? (__ > :more ())))
(is (= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
                      (take 12 (->> [0 1]
                                    (iterate (fn [[a b]] [b (+ a b)]))
                                    (map first) ; fibonacci numbers
                                    (__ (fn [a b] ; both even or both odd
                                          (= (mod a 2) (mod b 2)))
                                        :same)))))))