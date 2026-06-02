(ns
 ^{:difficulty "easy", :tags [], :description "Given two integers, write a function which\nreturns the greatest common divisor."} boywhoroared.4clojure.p66-greatest-common-divisor-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-66-test
 (testing
  "Problem 66: Given two integers, write a function which\nreturns the greatest common divisor."
  (is (= (__ 2 4) 2))
  (is (= (__ 10 5) 5))
  (is (= (__ 5 7) 1))
  (is (= (__ 1023 858) 33))))

