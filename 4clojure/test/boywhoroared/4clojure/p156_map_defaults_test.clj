(ns
 boywhoroared.4clojure.p156-map-defaults-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-156-test
  (testing
   "Problem 156: "
    (is (= (__ 0 [:a :b :c]) {:a 0, :b 0, :c 0}))
    (is (= (__ "x" [1 2 3]) {1 "x", 2 "x", 3 "x"}))
    (is (= (__ [:a :b] [:foo :bar]) {:foo [:a :b], :bar [:a :b]}))))

