(ns boywhoroared.4clojure.p5-conj-on-lists-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def ans-1 '(1 2 3 4))
(def ans-2 '(1 2 3 4))

(deftest
  problem-5-test
  (testing
   "Problem 5: "
    (is (= ans-1 (conj '(2 3 4) 1)))
    (is (= ans-2 (conj '(3 4) 2 1)))))

(run-tests)
