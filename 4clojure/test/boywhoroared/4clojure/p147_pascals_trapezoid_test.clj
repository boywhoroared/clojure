(ns
 boywhoroared.4clojure.p147-pascals-trapezoid-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-147-test
  (testing
   "Problem 147: "
    (is (= (second (__ [2 3 2])) [2 5 5 2]))
    (is (= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
    (is (= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]]))
    (is (= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2])))))))

