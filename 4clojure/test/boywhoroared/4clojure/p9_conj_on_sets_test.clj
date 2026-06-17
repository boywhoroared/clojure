(ns
 ^{:difficulty "elementary", :tags [], :description "When operating on a set,
the conj function returns a new set with one or more keys \"added\"."} boywhoroared.4clojure.p9-conj-on-sets-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ 2)
;; `conj` inserts the element INTO the set

(deftest
  problem-9-test
  (testing
   "Problem 9: When operating on a set,
the conj function returns a new set with one or more keys \"added\"."
    (is (= #{1 4 3 2} (conj #{1 4 3} __)))))

(run-tests)
