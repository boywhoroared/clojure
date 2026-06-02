(ns
 boywhoroared.4clojure.p83-a-half-truth-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-83-test
 (testing
  "Problem 83: "
  (is (= false (__ false false)))
  (is (= true (__ true false)))
  (is (= false (__ true)))
  (is (= true (__ false true false)))
  (is (= false (__ true true true)))
  (is (= true (__ true true true false)))))

