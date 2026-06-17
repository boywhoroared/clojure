(ns
  ^{:id 67 :difficulty "medium" :tags ["primes"] :description "Write a function which returns the first x
number of prime numbers."} boywhoroared.4clojure.p67-prime-numbers-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-67-test
     (testing "Problem 67: Write a function which returns the first x
number of prime numbers."
       (is (= (__ 2) [2 3]))
(is (= (__ 5) [2 3 5 7 11]))
(is (= (last (__ 100)) 541))))