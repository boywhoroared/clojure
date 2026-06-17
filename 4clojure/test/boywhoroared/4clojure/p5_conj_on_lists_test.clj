(ns
 ^{:difficulty "elementary", :tags [], :description "When operating on a list,
the conj function will return a new list
with one or more items \"added\" to the front."} boywhoroared.4clojure.p5-conj-on-lists-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def ans-1 '(1 2 3 4))
(def ans-2 '(1 2 3 4))

(deftest
  problem-5-test
  (testing
   "Problem 5: When operating on a list,
the conj function will return a new list
with one or more items \"added\" to the front."
    (is (= __ (conj '(2 3 4) 1)))
    (is (= __ (conj '(3 4) 2 1)))))

(run-tests)
