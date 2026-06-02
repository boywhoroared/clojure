(ns
 boywhoroared.4clojure.p68-recurring-theme-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-68-test
 (testing
  "Problem 68: "
  (is
   (=
    __
    (loop
     [x 5 result []]
     (if (> x 0) (recur (dec x) (conj result (+ 2 x))) result))))))

