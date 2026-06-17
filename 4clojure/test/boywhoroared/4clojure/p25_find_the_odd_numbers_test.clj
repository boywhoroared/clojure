(ns
  ^{:id 25 :difficulty "easy" :tags ["seqs"] :description "Write a function which returns
only the odd numbers from a sequence."} boywhoroared.4clojure.p25-find-the-odd-numbers-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-25-test
     (testing "Problem 25: Write a function which returns
only the odd numbers from a sequence."
       (is (= (__ #{1 2 3 4 5}) '(1 3 5)))
(is (= (__ [4 2 1 6]) '(1)))
(is (= (__ [2 2 4 6]) '()))
(is (= (__ [1 1 1 3]) '(1 1 1 3)))))