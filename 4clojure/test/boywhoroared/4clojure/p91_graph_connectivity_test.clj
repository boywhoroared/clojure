(ns
 boywhoroared.4clojure.p91-graph-connectivity-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-91-test
  (testing
   "Problem 91: "
    (is (= true (__ #{[:a :a]})))
    (is (= true (__ #{[:a :b]})))
    (is (= false (__ #{[2 3] [6 4] [5 6] [4 5] [3 1] [1 2]})))
    (is (= true (__ #{[2 3] [3 4] [6 4] [5 6] [4 5] [3 1] [1 2]})))
    (is
     (= false (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:b :c]})))
    (is
     (=
      true
      (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:x :a] [:b :c]})))))

