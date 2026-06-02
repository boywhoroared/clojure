(ns
 boywhoroared.4clojure.p168-infinite-matrix-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-168-test
  (testing
   "Problem 168: "
    (is
     (=
      (take 5 (map (fn* [p1__218#] (take 6 p1__218#)) (__ str)))
      [["00" "01" "02" "03" "04" "05"]
       ["10" "11" "12" "13" "14" "15"]
       ["20" "21" "22" "23" "24" "25"]
       ["30" "31" "32" "33" "34" "35"]
       ["40" "41" "42" "43" "44" "45"]]))
    (is
     (=
      (take 6 (map (fn* [p1__219#] (take 5 p1__219#)) (__ str 3 2)))
      [["32" "33" "34" "35" "36"]
       ["42" "43" "44" "45" "46"]
       ["52" "53" "54" "55" "56"]
       ["62" "63" "64" "65" "66"]
       ["72" "73" "74" "75" "76"]
       ["82" "83" "84" "85" "86"]]))
    (is
     (=
      (__ * 3 5 5 7)
      [[15 18 21 24 27 30 33]
       [20 24 28 32 36 40 44]
       [25 30 35 40 45 50 55]
       [30 36 42 48 54 60 66]
       [35 42 49 56 63 70 77]]))
    (is
     (=
      (__ (fn* [p1__220# p2__221#] (/ p1__220# (inc p2__221#))) 1 0 6 4)
      [[1 1/2 1/3 1/4]
       [2 1 2/3 1/2]
       [3 3/2 1 3/4]
       [4 2 4/3 1]
       [5 5/2 5/3 5/4]
       [6 3 2 3/2]]))
    (is
     (=
      (class (__ (juxt bit-or bit-xor)))
      (class (__ (juxt quot mod) 13 21))
      (class (lazy-seq))))
    (is
     (=
      (class (nth (__ (constantly 10946)) 34))
      (class (nth (__ (constantly 0) 5 8) 55))
      (class (lazy-seq))))
    (is
     (=
      (let
       [m
        377
        n
        610
        w
        987
        check
        (fn [f s] (every? true? (map-indexed f s)))
        row
        (take w (nth (__ vector) m))
        column
        (take w (map first (__ vector m n)))
        diagonal
        (map-indexed
         (fn* [p1__223# p2__222#] (nth p2__222# p1__223#))
         (__ vector m n w w))]
        (and
         (check (fn* [p1__225# p2__224#] (= p2__224# [m p1__225#])) row)
         (check
          (fn* [p1__227# p2__226#] (= p2__226# [(+ m p1__227#) n]))
          column)
         (check
          (fn*
           [p1__229# p2__228#]
           (= p2__228# [(+ m p1__229#) (+ n p1__229#)]))
          diagonal)))
      true))))

