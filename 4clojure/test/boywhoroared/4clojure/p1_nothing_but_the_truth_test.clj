(ns
 ^{:difficulty "elementary", :tags [], :description "Complete the expression so\nit will evaluate to true."} boywhoroared.4clojure.p1-nothing-but-the-truth-test
 (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ true)

(deftest
 problem-1-test
 (testing
  "Problem 1: Complete the expression so\nit will evaluate to true."
  (is (= __ true))))


(run-tests 'boywhoroared.4clojure.p1-nothing-but-the-truth-test)
