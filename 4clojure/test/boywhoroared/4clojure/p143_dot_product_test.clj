(ns
 boywhoroared.4clojure.p143-dot-product-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-143-test
  (testing
   "Problem 143: "
    (is (= 0 (__ [0 1 0] [1 0 0])))
    (is (= 3 (__ [1 1 1] [1 1 1])))
    (is (= 32 (__ [1 2 3] [4 5 6])))
    (is (= 256 (__ [2 5 6] [100 10 1])))))

