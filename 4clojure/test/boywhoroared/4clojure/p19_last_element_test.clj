(ns
 boywhoroared.4clojure.p19-last-element-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-19-test
  (testing
   "Problem 19: "
    (is (= (__ [1 2 3 4 5]) 5))
    (is (= (__ '(5 4 3)) 3))
    (is (= (__ ["b" "c" "d"]) "d"))))

