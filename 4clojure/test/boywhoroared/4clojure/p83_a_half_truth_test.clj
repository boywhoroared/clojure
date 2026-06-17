(ns
  ^{:id 83 :difficulty "easy" :tags [] :description "Write a function which takes
a variable number of booleans.
Your function should return true if
some of the parameters are true,
but not all of the parameters are true.
Otherwise your function should return false."} boywhoroared.4clojure.p83-a-half-truth-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-83-test
     (testing "Problem 83: Write a function which takes
a variable number of booleans.
Your function should return true if
some of the parameters are true,
but not all of the parameters are true.
Otherwise your function should return false."
       (is (= false (__ false false)))
(is (= true (__ true false)))
(is (= false (__ true)))
(is (= true (__ false true false)))
(is (= false (__ true true true)))
(is (= true (__ true true true false)))))