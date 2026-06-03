(ns
 ^{:difficulty "", :tags nil, :description "Write a function which takes three or more integers.\nUsing these integers, your function should\ngenerate clojure code representing an equation.\nThe following rules for the equation must be satisfied:\n\n1. All integers must be used once and only once.\n\n2. The order of the integers must be\n   maintained when reading the equation left-to-right.\n\n3. The only functions you may use are +, *, or =.\n\n4. The equation must use the minimum number of parentheses.\n\n5. If no satisfying equation exists, return nil."} boywhoroared.4clojure.p87-create-an-equation-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-87-test
 (testing
  "Problem 87: Write a function which takes three or more integers.\nUsing these integers, your function should\ngenerate clojure code representing an equation.\nThe following rules for the equation must be satisfied:\n\n1. All integers must be used once and only once.\n\n2. The order of the integers must be\n   maintained when reading the equation left-to-right.\n\n3. The only functions you may use are +, *, or =.\n\n4. The equation must use the minimum number of parentheses.\n\n5. If no satisfying equation exists, return nil."
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

