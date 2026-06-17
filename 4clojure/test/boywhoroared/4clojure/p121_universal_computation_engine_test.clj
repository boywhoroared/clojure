(ns
  ^{:id 121 :difficulty "medium" :tags ["functions"] :description "Given a mathematical formula in prefix notation,
return a function that calculates the value of the formula.
The formula can contain nested calculations using
the four basic mathematical operators, numeric constants,
and symbols representing variables.
The returned function has to accept a single parameter
containing the map of variable names to their values."} boywhoroared.4clojure.p121-universal-computation-engine-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-121-test
     (testing "Problem 121: Given a mathematical formula in prefix notation,
return a function that calculates the value of the formula.
The formula can contain nested calculations using
the four basic mathematical operators, numeric constants,
and symbols representing variables.
The returned function has to accept a single parameter
containing the map of variable names to their values."
       (is (= 2 ((__ '(/ a b))
                         '{b 8
                           a 16})))
(is (= 8 ((__ '(+ a b 2))
                         '{a 2
                           b 4})))
(is (= [6 0 -4]
                      (map (__ '(* (+ 2 a)
                                    (- 10 b)))
                           '[{a 1
                              b 8}
                             {b 5
                              a -2}
                             {a 2
                              b 11}])))
(is (= 1 ((__ '(/ (+ x 2)
                                  (* 3 (+ y 1))))
                         '{x 4
                           y 1})))))