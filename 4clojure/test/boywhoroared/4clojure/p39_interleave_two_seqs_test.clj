(ns
 boywhoroared.4clojure.p39-interleave-two-seqs-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-39-test
  (testing
   "Problem 39: "
    (is (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
    (is (= (__ [1 2] [3 4 5 6]) '(1 3 2 4)))
    (is (= (__ [1 2 3 4] [5]) [1 5]))
    (is (= (__ [30 20] [25 15]) [30 25 20 15]))))

