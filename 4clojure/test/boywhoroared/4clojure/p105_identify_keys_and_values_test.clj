(ns
 boywhoroared.4clojure.p105-identify-keys-and-values-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-105-test
 (testing
  "Problem 105: "
  (is (= {} (__ [])))
  (is (= {:a [1]} (__ [:a 1])))
  (is (= {:a [1], :b [2]} (__ [:a 1 :b 2])))
  (is (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4])))))

