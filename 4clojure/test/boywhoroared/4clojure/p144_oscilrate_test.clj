(ns
 boywhoroared.4clojure.p144-oscilrate-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-144-test
  (testing
   "Problem 144: "
    (is (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
    (is
     (=
      (take
       5
       (__
        3
        (fn* [p1__206#] (- p1__206# 3))
        (fn* [p1__207#] (+ 5 p1__207#))))
      [3 0 5 2 7]))
    (is
     (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]))))

