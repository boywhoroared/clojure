(ns
 boywhoroared.4clojure.p5-conj-on-lists-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-5-test
 (testing
  "Problem 5: "
  (is (= __ (conj '(2 3 4) 1)))
  (is (= __ (conj '(3 4) 2 1)))))

