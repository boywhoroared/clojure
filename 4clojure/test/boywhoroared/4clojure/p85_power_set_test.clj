(ns
 boywhoroared.4clojure.p85-power-set-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-85-test
 (testing
  "Problem 85: "
  (is (= (__ #{1 :a}) #{#{1 :a} #{} #{1} #{:a}}))
  (is (= (__ #{}) #{#{}}))
  (is
   (=
    (__ #{1 3 2})
    #{#{} #{3} #{2} #{1} #{1 3 2} #{1 3} #{1 2} #{3 2}}))
  (is (= (count (__ (into #{} (range 10)))) 1024))))

