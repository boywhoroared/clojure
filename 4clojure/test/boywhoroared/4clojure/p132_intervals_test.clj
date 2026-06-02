(ns
 boywhoroared.4clojure.p132-intervals-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-132-test
 (testing
  "Problem 132: "
  (is (= '(1 :less 6 :less 7 4 3) (__ < :less [1 6 7 4 3])))
  (is (= '(2) (__ > :more [2])))
  (is
   (=
    [0 1 :x 2 :x 3 :x 4]
    (__
     (fn*
      [p1__204# p2__205#]
      (and (pos? p1__204#) (< p1__204# p2__205#)))
     :x
     (range 5))))
  (is (empty? (__ > :more ())))
  (is
   (=
    [0 1 :same 1 2 3 :same 5 8 13 :same 21]
    (take
     12
     (->>
      [0 1]
      (iterate (fn [[a b]] [b (+ a b)]))
      (map first)
      (__ (fn [a b] (= (mod a 2) (mod b 2))) :same)))))))

