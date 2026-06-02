(ns
 boywhoroared.4clojure.p116-prime-sandwich-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-116-test
 (testing
  "Problem 116: "
  (is (= false (__ 4)))
  (is (= true (__ 563)))
  (is (= 1103 (nth (filter __ (range)) 15)))))

