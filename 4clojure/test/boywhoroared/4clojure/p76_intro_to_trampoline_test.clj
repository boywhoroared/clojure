(ns
 boywhoroared.4clojure.p76-intro-to-trampoline-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-76-test
  (testing
   "Problem 76: "
    (is
     (=
      __
      (letfn
       [(foo [x y] (fn* [] (bar (conj x y) y)))
        (bar [x y] (if (> (last x) 10) x (fn* [] (foo x (+ 2 y)))))]
        (trampoline foo [] 1))))))

