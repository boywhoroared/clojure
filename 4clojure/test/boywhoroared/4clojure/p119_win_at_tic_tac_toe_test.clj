(ns
 boywhoroared.4clojure.p119-win-at-tic-tac-toe-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-119-test
  (testing
   "Problem 119: "
    (is
     (is
      (=
       (__ :x [[:o :e :e] [:o :x :o] [:x :x :e]])
       #{[2 2] [0 2] [0 1]})))
    (is
     (is
      (=
       (__ :x [[:x :o :o] [:x :x :e] [:e :o :e]])
       #{[2 2] [2 0] [1 2]})))
    (is
     (is
      (=
       (__ :x [[:x :e :x] [:o :x :o] [:e :o :e]])
       #{[2 2] [2 0] [0 1]})))
    (is (is (= (__ :x [[:x :x :o] [:e :e :e] [:e :e :e]]) #{})))
    (is
     (is (= (__ :o [[:x :x :o] [:o :e :o] [:x :e :e]]) #{[2 2] [1 1]})))))

