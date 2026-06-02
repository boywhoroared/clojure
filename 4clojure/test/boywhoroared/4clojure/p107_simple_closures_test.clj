(ns
 boywhoroared.4clojure.p107-simple-closures-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-107-test
 (testing
  "Problem 107: "
  (is (= 256 ((__ 2) 16) ((__ 8) 2)))
  (is (= [1 8 27 64] (map (__ 3) [1 2 3 4])))
  (is
   (=
    [1 2 4 8 16]
    (map (fn* [p1__199#] ((__ p1__199#) 2)) [0 1 2 3 4])))))

