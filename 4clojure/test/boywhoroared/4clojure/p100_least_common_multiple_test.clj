(ns
 boywhoroared.4clojure.p100-least-common-multiple-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-100-test
 (testing
  "Problem 100: "
  (is (== (__ 2 3) 6))
  (is (== (__ 5 3 7) 105))
  (is (== (__ 1/3 2/5) 2))
  (is (== (__ 3/4 1/6) 3/2))
  (is (== (__ 7 5/7 2 3/5) 210))))

