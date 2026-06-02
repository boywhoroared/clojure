(ns
 boywhoroared.4clojure.p75-eulers-totient-function-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-75-test
  (testing
   "Problem 75: "
    (is (= (__ 1) 1))
    (is (= (__ 10) (count '(1 3 7 9)) 4))
    (is (= (__ 40) 16))
    (is (= (__ 99) 60))))

