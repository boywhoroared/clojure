(ns
 boywhoroared.4clojure.p50-split-by-type-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-50-test
  (testing
   "Problem 50: "
    (is (= (set (__ [1 :a 2 :b 3 :c])) #{[:a :b :c] [1 2 3]}))
    (is (= (set (__ [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]}))
    (is
     (=
      (set (__ [[1 2] :a [3 4] 5 6 :b]))
      #{[:a :b] [[1 2] [3 4]] [5 6]}))))

