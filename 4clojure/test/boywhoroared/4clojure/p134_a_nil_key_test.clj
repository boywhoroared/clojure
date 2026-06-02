(ns
 boywhoroared.4clojure.p134-a-nil-key-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-134-test
  (testing
   "Problem 134: "
    (is (true? (__ :a {:a nil, :b 2})))
    (is (false? (__ :b {:a nil, :b 2})))
    (is (false? (__ :c {:a nil, :b 2})))))

