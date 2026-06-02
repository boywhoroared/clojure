(ns
 boywhoroared.4clojure.p125-gus-quinundrum-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-125-test
 (testing "Problem 125: " (is (= (str '__) (__)))))

