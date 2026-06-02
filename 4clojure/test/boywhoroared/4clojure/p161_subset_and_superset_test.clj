(ns
 boywhoroared.4clojure.p161-subset-and-superset-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-161-test
 (testing
  "Problem 161: "
  (is (clojure.set/superset? __ #{2}))
  (is (clojure.set/subset? #{1} __))
  (is (clojure.set/superset? __ #{1 2}))
  (is (clojure.set/subset? #{1 2} __))))

