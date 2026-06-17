(ns
  ^{:id 99 :difficulty "easy" :tags ["math" "seqs"] :description "Write a function which multiplies two numbers
and returns the result as a sequence of its digits."} boywhoroared.4clojure.p99-product-digits-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-99-test
     (testing "Problem 99: Write a function which multiplies two numbers
and returns the result as a sequence of its digits."
       (is (= (__ 1 1) [1]))
(is (= (__ 99 9) [8 9 1]))
(is (= (__ 999 99) [9 8 9 0 1]))))