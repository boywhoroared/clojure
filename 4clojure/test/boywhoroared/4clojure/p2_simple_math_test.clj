(ns
 boywhoroared.4clojure.p2-simple-math-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ 4)

(deftest
  problem-2-test
  (testing "Problem 2: " (is (= (- 10 (* 2 3)) __))))

(run-tests)

