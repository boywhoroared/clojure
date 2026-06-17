(ns
  ^{:id 24 :difficulty "easy" :tags ["seqs"] :description "Write a function which returns
the sum of a sequence of numbers."} boywhoroared.4clojure.p24-sum-it-all-up-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-24-test
     (testing "Problem 24: Write a function which returns
the sum of a sequence of numbers."
       (is (= (__ [1 2 3]) 6))
(is (= (__ (list 0 -2 5 5)) 8))
(is (= (__ #{4 2 1}) 7))
(is (= (__ '(0 0 -1)) -1))
(is (= (__ '(1 10 3)) 14))))