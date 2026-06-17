(ns
  ^{:id 21 :difficulty "easy" :tags ["seqs" "core-functions"] :description "Write a function which returns
the Nth element from a sequence."} boywhoroared.4clojure.p21-nth-element-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-21-test
     (testing "Problem 21: Write a function which returns
the Nth element from a sequence."
       (is (= (__ '(4 5 6 7) 2) 6))
(is (= (__ [:a :b :c] 0) :a))
(is (= (__ [1 2 3 4] 1) 2))
(is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]))))