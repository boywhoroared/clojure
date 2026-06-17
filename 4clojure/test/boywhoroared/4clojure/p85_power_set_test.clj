(ns
  ^{:id 85 :difficulty "medium" :tags ["set-theory"] :description "Write a function which generates the power set of a given set.
The power set of a set x is the set of all subsets of x,
including the empty set and x itself."} boywhoroared.4clojure.p85-power-set-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-85-test
     (testing "Problem 85: Write a function which generates the power set of a given set.
The power set of a set x is the set of all subsets of x,
including the empty set and x itself."
       (is (= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
(is (= (__ #{}) #{#{}}))
(is (= (__ #{1 2 3})
   #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
(is (= (count (__ (into #{} (range 10)))) 1024))))