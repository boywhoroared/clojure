(ns
 boywhoroared.4clojure.p79-triangle-minimal-path-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-79-test
  (testing
   "Problem 79: "
    (is (= (__ [[1] [2 4] [5 1 4] [2 3 4 5]]) (+ 1 2 1 3) 7))
    (is
     (=
      (__ [[3] [2 4] [1 9 3] [9 9 2 4] [4 6 6 7 8] [5 7 3 5 1 4]])
      (+ 3 4 3 2 7 1)
      20))))

