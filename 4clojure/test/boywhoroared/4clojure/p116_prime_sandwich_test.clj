(ns
 ^{:difficulty "medium", :tags ["math"], :description "A balanced prime is a prime number which is\nalso the mean of the primes directly before\nand after it in the sequence of valid primes.\nCreate a function which takes an integer n,\nand returns true iff it is a balanced prime."} boywhoroared.4clojure.p116-prime-sandwich-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-116-test
 (testing
  "Problem 116: A balanced prime is a prime number which is\nalso the mean of the primes directly before\nand after it in the sequence of valid primes.\nCreate a function which takes an integer n,\nand returns true iff it is a balanced prime."
  (is (= false (__ 4)))
  (is (= true (__ 563)))
  (is (= 1103 (nth (filter __ (range)) 15)))))

