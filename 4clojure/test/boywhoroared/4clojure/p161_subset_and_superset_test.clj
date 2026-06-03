(ns
 ^{:difficulty "elementary", :tags ["set-theory"], :description "Set A is a subset of set B, or equivalently B is a superset of A,\n    if A is \"contained\" inside B. A and B may coincide."} boywhoroared.4clojure.p161-subset-and-superset-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-161-test
 (testing
  "Problem 161: Set A is a subset of set B, or equivalently B is a superset of A,\n    if A is \"contained\" inside B. A and B may coincide."
  (is (clojure.set/superset? __ #{2}))
  (is (clojure.set/subset? #{1} __))
  (is (clojure.set/superset? __ #{1 2}))
  (is (clojure.set/subset? #{1 2} __))))

