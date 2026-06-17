(ns
 ^{:difficulty "elementary",
   :tags [],
   :description "Clojure has many different ways to create functions."}
 boywhoroared.4clojure.p14-functions-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ 8)

(deftest
  problem-14-test
  (testing
   "Problem 14: Clojure has many different ways to create functions."
    (is (= __ ((fn add-five [x] (+ x 5)) 3))) ; These forms are like JavaScript's IIFE
    (is (= __ ((fn [x] (+ x 5)) 3)))
    (is (= __ (#(+ % 5) 3)))
    (is (= __ ((partial + 5) 3)))))

(run-tests)
