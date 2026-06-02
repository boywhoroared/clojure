(ns
 boywhoroared.4clojure.p93-partially-flatten-a-sequence-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-93-test
  (testing
   "Problem 93: "
    (is (= (__ [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]]))
    (is
     (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]]) [[:a :b] [:c :d] [:e :f]]))
    (is (= (__ '((1 2) ((3 4) ((((5 6))))))) '((1 2) (3 4) (5 6))))))

