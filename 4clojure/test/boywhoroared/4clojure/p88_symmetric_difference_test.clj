(ns
  ^{:id 88 :difficulty "easy" :tags ["set-theory"] :description "Write a function which returns
the symmetric difference of two sets.
The symmetric difference is the set of items
belonging to one but not both of the two sets."} boywhoroared.4clojure.p88-symmetric-difference-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-88-test
     (testing "Problem 88: Write a function which returns
the symmetric difference of two sets.
The symmetric difference is the set of items
belonging to one but not both of the two sets."
       (is (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
(is (= (__ #{:a :b :c} #{}) #{:a :b :c}))
(is (= (__ #{} #{4 5 6}) #{4 5 6}))
(is (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]}))))