(ns
 boywhoroared.4clojure.p108-lazy-searching-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-108-test
  (testing
   "Problem 108: "
    (is (= 3 (__ [3 4 5])))
    (is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
    (is
     (=
      64
      (__
       (map (fn* [p1__200#] (* p1__200# p1__200# p1__200#)) (range))
       (filter
        (fn* [p1__201#] (zero? (bit-and p1__201# (dec p1__201#))))
        (range))
       (iterate inc 20))))
    (is (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])))))

