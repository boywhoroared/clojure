(ns
 ^{:difficulty "elementary", :tags [], :description "All Clojure collections support sequencing.
You can operate on sequences with functions
like first, second, and last."} boywhoroared.4clojure.p12-sequences-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ 3)

(deftest
  problem-12-test
  (testing
   "Problem 12: All Clojure collections support sequencing.
You can operate on sequences with functions
like first, second, and last."
    (is (= __ (first '(3 2 1))))
    (is (= __ (second [2 3 4])))
    (is (= __ (last (list 1 2 3))))))

(run-tests)
