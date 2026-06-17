(ns
  ^{:id 55 :difficulty "medium" :tags ["seqs" "core-functions"] :description "Write a function which returns a map
containing the number of occurences
of each distinct item in a sequence."} boywhoroared.4clojure.p55-count-occurences-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-55-test
     (testing "Problem 55: Write a function which returns a map
containing the number of occurences
of each distinct item in a sequence."
       (is (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
(is (= (__ [:b :a :b :a :b]) {:a 2, :b 3}))
(is (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))))