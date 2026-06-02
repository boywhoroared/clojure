(ns
 boywhoroared.4clojure.p87-create-an-equation-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-87-test
  (testing
   "Problem 87: "
    (is (= (__ 3 4 7) '(= (+ 3 4) 7)))
    (is (= (__ 3 4 12) '(= (* 3 4) 12)))
    (is (= (__ 3 4 14) nil))
    (is (= (__ 3 4 5 35) '(= (* (+ 3 4) 5) 35)))
    (is (= (__ 3 4 5 60) '(= (* 3 4 5) 60)))
    (is (= (__ 3 4 5 23) '(= (+ 3 (* 4 5)) 23)))
    (is (= (__ 3 4 5 27) '(= (* 3 (+ 4 5)) 27)))
    (is (= (__ 3 4 5 6) nil))
    (is (= (__ 1 2 10 100 2001) '(= (+ 1 (* 2 10 100)) 2001)))
    (is (= (__ 1 2 10 100 1300) '(= (* (+ 1 2 10) 100) 1300)))))

