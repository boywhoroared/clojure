(ns
 boywhoroared.4clojure.p56-find-distinct-items-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-56-test
  (testing
   "Problem 56: "
    (is (= (__ [1 2 1 3 1 2 4]) [1 2 3 4]))
    (is (= (__ [:a :a :b :b :c :c]) [:a :b :c]))
    (is (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
    (is (= (__ (range 50)) (range 50)))))

