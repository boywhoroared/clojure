(ns
  ^{:id 78 :difficulty "medium" :tags ["core-functions"] :description "Reimplement the function described in <a href="76"> "Intro to Trampoline"</a>."} boywhoroared.4clojure.p78-reimplement-trampoline-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-78-test
     (testing "Problem 78: Reimplement the function described in <a href="76"> "Intro to Trampoline"</a>."
       (is (= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (__ triple 2))
  82))
(is (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial __ my-even?) (range 6)))
  [true false true false true false]))))