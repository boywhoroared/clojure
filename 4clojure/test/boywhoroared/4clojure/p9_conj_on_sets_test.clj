(ns
 boywhoroared.4clojure.p9-conj-on-sets-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-9-test
  (testing "Problem 9: " (is (= #{1 4 3 2} (conj #{1 4 3} __)))))

