(ns
 boywhoroared.4clojure.p145-for-the-win-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-145-test
 (testing
  "Problem 145: "
  (is (= __ (for [x (range 40) :when (= 1 (rem x 4))] x)))
  (is
   (=
    __
    (for
     [x
      (iterate (fn* [p1__208#] (+ 4 p1__208#)) 0)
      :let
      [z (inc x)]
      :while
      (< z 40)]
     z)))
  (is (= __ (for [[x y] (partition 2 (range 20))] (+ x y))))))

