(ns
  ^{:id 66 :difficulty "easy" :tags [] :description "Given two integers, write a function which
returns the greatest common divisor."} boywhoroared.4clojure.p66-greatest-common-divisor-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-66-test
     (testing "Problem 66: Given two integers, write a function which
returns the greatest common divisor."
       (is (= (__ 2 4) 2))
(is (= (__ 10 5) 5))
(is (= (__ 5 7) 1))
(is (= (__ 1023 858) 33))))