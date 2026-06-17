(ns
  ^{:id 116 :difficulty "medium" :tags ["math"] :description "A balanced prime is a prime number which is
also the mean of the primes directly before
and after it in the sequence of valid primes.
Create a function which takes an integer n,
and returns true iff it is a balanced prime."} boywhoroared.4clojure.p116-prime-sandwich-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-116-test
     (testing "Problem 116: A balanced prime is a prime number which is
also the mean of the primes directly before
and after it in the sequence of valid primes.
Create a function which takes an integer n,
and returns true iff it is a balanced prime."
       (is (= false (__ 4)))
(is (= true (__ 563)))
(is (= 1103 (nth (filter __ (range)) 15)))))