(ns
 boywhoroared.4clojure.p11-conj-on-maps-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-11-test
  (testing
   "Problem 11: "
    (is (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3])))))

