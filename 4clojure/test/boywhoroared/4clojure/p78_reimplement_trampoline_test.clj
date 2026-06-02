(ns
 ^{:difficulty "medium", :tags ["core-functions"], :description "Reimplement the function described in <a href=\"76\"> \"Intro to Trampoline\"</a>."} boywhoroared.4clojure.p78-reimplement-trampoline-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-78-test
 (testing
  "Problem 78: Reimplement the function described in <a href=\"76\"> \"Intro to Trampoline\"</a>."
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

