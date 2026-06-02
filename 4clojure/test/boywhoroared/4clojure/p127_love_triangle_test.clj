(ns
 boywhoroared.4clojure.p127-love-triangle-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-127-test
 (testing
  "Problem 127: "
  (is (= 10 (__ [15 15 15 15 15])))
  (is (= 15 (__ [1 3 7 15 31])))
  (is (= 3 (__ [3 3])))
  (is (= 4 (__ [7 3])))
  (is (= 6 (__ [17 22 6 14 22])))
  (is (= 9 (__ [18 7 14 14 6 3])))
  (is (= nil (__ [21 10 21 10])))
  (is (= nil (__ [0 31 0 31 0])))))

