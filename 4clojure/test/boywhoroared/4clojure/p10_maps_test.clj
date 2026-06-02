(ns
 boywhoroared.4clojure.p10-maps-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-10-test
 (testing
  "Problem 10: "
  (is (= __ ((hash-map :a 10 :b 20 :c 30) :b)))
  (is (= __ (:b {:a 10, :b 20, :c 30})))))

