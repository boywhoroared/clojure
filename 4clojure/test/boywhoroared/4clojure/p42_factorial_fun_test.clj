(ns
  ^{:id 42 :difficulty "easy" :tags ["math"] :description "Write a function which calculates factorials."} boywhoroared.4clojure.p42-factorial-fun-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-42-test
     (testing "Problem 42: Write a function which calculates factorials."
       (is (= (__ 1) 1))
(is (= (__ 3) 6))
(is (= (__ 5) 120))
(is (= (__ 8) 40320))))