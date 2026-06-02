(ns
 boywhoroared.4clojure.p48-intro-to-some-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-48-test
 (testing
  "Problem 48: "
  (is (= __ (some #{7 6 2} [5 6 7 8])))
  (is
   (=
    __
    (some
     (fn* [p1__188#] (when (even? p1__188#) p1__188#))
     [5 6 7 8])))))

