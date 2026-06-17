(ns
  ^{:id 81 :difficulty "easy" :tags ["set-theory"] :description "Write a function which returns
the intersection of two sets.
The intersection is the sub-set of items
that each set has in common."} boywhoroared.4clojure.p81-set-intersection-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-81-test
     (testing "Problem 81: Write a function which returns
the intersection of two sets.
The intersection is the sub-set of items
that each set has in common."
       (is (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3}))
(is (= (__ #{0 1 2} #{3 4 5}) #{}))
(is (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d}))))