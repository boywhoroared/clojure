(ns
 boywhoroared.4clojure.p36-let-it-be-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-36-test
  (testing
   "Problem 36: "
    (is (= 10 (let __ (+ x y))))
    (is (= 4 (let __ (+ y z))))
    (is (= 1 (let __ z)))))

