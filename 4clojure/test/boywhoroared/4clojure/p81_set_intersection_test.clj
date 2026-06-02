(ns
 boywhoroared.4clojure.p81-set-intersection-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-81-test
 (testing
  "Problem 81: "
  (is (= (__ #{0 1 3 2} #{4 3 2 5}) #{3 2}))
  (is (= (__ #{0 1 2} #{4 3 5}) #{}))
  (is (= (__ #{:c :b :d :a} #{:e :c :d :f :a}) #{:c :d :a}))))

