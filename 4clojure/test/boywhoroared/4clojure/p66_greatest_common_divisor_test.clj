(ns
 boywhoroared.4clojure.p66-greatest-common-divisor-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-66-test
  (testing
   "Problem 66: "
    (is (= (__ 2 4) 2))
    (is (= (__ 10 5) 5))
    (is (= (__ 5 7) 1))
    (is (= (__ 1023 858) 33))))

