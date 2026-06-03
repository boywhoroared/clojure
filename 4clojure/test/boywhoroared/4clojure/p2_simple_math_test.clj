(ns
 ^{:difficulty "elementary", :tags [], :description "Innermost forms are evaluated first."} boywhoroared.4clojure.p2-simple-math-test
 (:require [clojure.test :refer [deftest is testing]]))

(def __ 4)

(deftest
 problem-2-test
 (testing
  "Problem 2: Innermost forms are evaluated first."
  (is (= (- 10 (* 2 3)) __))))

