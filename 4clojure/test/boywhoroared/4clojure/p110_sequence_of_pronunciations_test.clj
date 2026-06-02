(ns
 boywhoroared.4clojure.p110-sequence-of-pronunciations-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-110-test
  (testing
   "Problem 110: "
    (is (= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1]))))
    (is (= [3 1 2 4] (first (__ [1 1 1 4 4]))))
    (is (= [1 1 1 3 2 1 3 2 1 1] (nth (__ [1]) 6)))
    (is (= 338 (count (nth (__ [3 2]) 15))))))

