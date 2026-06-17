(ns
 ^{:difficulty "elementary", :tags [], :description "When operating on a Vector,
the conj function will return a new vector
with one or more items \"added\" to the end."} boywhoroared.4clojure.p7-conj-on-vectors-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ [1 2 3 4])

;; `conj` joins at the end of a vector
;; unlike a list, where new elements are inserted at the beginning

(deftest
  problem-7-test
  (testing
   "Problem 7: When operating on a Vector,
the conj function will return a new vector
with one or more items \"added\" to the end."
    (is (= __ (conj [1 2 3] 4)))
    (is (= __ (conj [1 2] 3 4)))))

(run-tests)
