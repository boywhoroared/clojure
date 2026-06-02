(ns
 boywhoroared.4clojure.p3-strings-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-3-test
  (testing "Problem 3: " (is (= __ (.toUpperCase "hello world")))))

