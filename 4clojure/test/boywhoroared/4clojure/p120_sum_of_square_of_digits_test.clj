(ns
 boywhoroared.4clojure.p120-sum-of-square-of-digits-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-120-test
  (testing
   "Problem 120: "
    (is (= 8 (__ (range 10))))
    (is (= 19 (__ (range 30))))
    (is (= 50 (__ (range 100))))
    (is (= 50 (__ (range 1000))))))

