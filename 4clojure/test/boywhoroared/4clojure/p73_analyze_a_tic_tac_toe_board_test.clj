(ns
 boywhoroared.4clojure.p73-analyze-a-tic-tac-toe-board-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-73-test
  (testing
   "Problem 73: "
    (is (= nil (__ [[:e :e :e] [:e :e :e] [:e :e :e]])))
    (is (= :x (__ [[:x :e :o] [:x :e :e] [:x :e :o]])))
    (is (= :o (__ [[:e :x :e] [:o :o :o] [:x :e :x]])))
    (is (= nil (__ [[:x :e :o] [:x :x :e] [:o :x :o]])))
    (is (= :x (__ [[:x :e :e] [:o :x :e] [:o :e :x]])))
    (is (= :o (__ [[:x :e :o] [:x :o :e] [:o :e :x]])))
    (is (= nil (__ [[:x :o :x] [:x :o :x] [:o :x :o]])))))

