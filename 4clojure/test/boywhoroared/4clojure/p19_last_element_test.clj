(ns
  ^{:id 19 :difficulty "easy" :tags ["seqs" "core-functions"] :description "Write a function which returns
the last element in a sequence."} boywhoroared.4clojure.p19-last-element-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-19-test
     (testing "Problem 19: Write a function which returns
the last element in a sequence."
       (is (= (__ [1 2 3 4 5]) 5))
(is (= (__ '(5 4 3)) 3))
(is (= (__ ["b" "c" "d"]) "d"))))