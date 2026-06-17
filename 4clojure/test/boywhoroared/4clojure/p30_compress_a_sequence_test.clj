(ns
  ^{:id 30 :difficulty "easy" :tags ["seqs"] :description "Write a function which removes
consecutive duplicates from a sequence."} boywhoroared.4clojure.p30-compress-a-sequence-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-30-test
     (testing "Problem 30: Write a function which removes
consecutive duplicates from a sequence."
       (is (= (apply str (__ "Leeeeeerrroyyy")) "Leroy"))
(is (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
(is (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))