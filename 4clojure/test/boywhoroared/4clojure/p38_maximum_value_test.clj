(ns
  ^{:id 38 :difficulty "easy" :tags ["core-functions"] :description "Write a function which takes a variable number
of parameters and returns the maximum value."} boywhoroared.4clojure.p38-maximum-value-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-38-test
     (testing "Problem 38: Write a function which takes a variable number
of parameters and returns the maximum value."
       (is (= (__ 1 8 3 4) 8))
(is (= (__ 30 20) 30))
(is (= (__ 45 67 11) 67))))