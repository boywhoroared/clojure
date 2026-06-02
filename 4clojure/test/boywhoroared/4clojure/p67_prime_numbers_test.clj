(ns
 ^{:difficulty "medium", :tags ["primes"], :description "Write a function which returns the first x\nnumber of prime numbers."} boywhoroared.4clojure.p67-prime-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-67-test
 (testing
  "Problem 67: Write a function which returns the first x\nnumber of prime numbers."
  (is (= (__ 2) [2 3]))
  (is (= (__ 5) [2 3 5 7 11]))
  (is (= (last (__ 100)) 541))))

