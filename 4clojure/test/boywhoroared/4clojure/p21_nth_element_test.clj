(ns
 boywhoroared.4clojure.p21-nth-element-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-21-test
 (testing
  "Problem 21: "
  (is (= (__ '(4 5 6 7) 2) 6))
  (is (= (__ [:a :b :c] 0) :a))
  (is (= (__ [1 2 3 4] 1) 2))
  (is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]))))

