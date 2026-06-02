(ns
 boywhoroared.4clojure.p45-intro-to-iterate-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-45-test
  (testing
   "Problem 45: "
    (is (= __ (take 5 (iterate (fn* [p1__187#] (+ 3 p1__187#)) 1))))))

