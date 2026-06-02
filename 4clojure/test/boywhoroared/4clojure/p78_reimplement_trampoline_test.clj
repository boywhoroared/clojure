(ns
 boywhoroared.4clojure.p78-reimplement-trampoline-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-78-test
 (testing
  "Problem 78: "
  (is
   (=
    (letfn
     [(triple [x] (fn* [] (sub-two (* 3 x))))
      (sub-two [x] (fn* [] (stop? (- x 2))))
      (stop? [x] (if (> x 50) x (fn* [] (triple x))))]
     (__ triple 2))
    82))
  (is
   (=
    (letfn
     [(my-even? [x] (if (zero? x) true (fn* [] (my-odd? (dec x)))))
      (my-odd? [x] (if (zero? x) false (fn* [] (my-even? (dec x)))))]
     (map (partial __ my-even?) (range 6)))
    [true false true false true false]))))

