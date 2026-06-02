(ns
 boywhoroared.4clojure.p166-comparisons-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-166-test
  (testing
   "Problem 166: "
    (is (= :gt (__ < 5 1)))
    (is (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum")))
    (is (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
    (is (= :gt (__ > 0 2)))))

