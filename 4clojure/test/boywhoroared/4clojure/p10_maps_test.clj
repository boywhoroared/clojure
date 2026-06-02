(ns
 boywhoroared.4clojure.p10-maps-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ 20)
;; hash-maps are still like maps, so :b returns the associated value 20

(deftest
  problem-10-test
  (testing
   "Problem 10: "
    (is (= __ ((hash-map :a 10 :b 20 :c 30) :b)))
    (is (= __ (:b {:a 10, :b 20, :c 30})))))

(run-tests)
