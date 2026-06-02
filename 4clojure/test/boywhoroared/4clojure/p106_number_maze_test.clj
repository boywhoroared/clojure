(ns
 boywhoroared.4clojure.p106-number-maze-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-106-test
 (testing
  "Problem 106: "
  (is (= 1 (__ 1 1)))
  (is (= 3 (__ 3 12)))
  (is (= 3 (__ 12 3)))
  (is (= 3 (__ 5 9)))
  (is (= 9 (__ 9 2)))
  (is (= 5 (__ 9 12)))))

