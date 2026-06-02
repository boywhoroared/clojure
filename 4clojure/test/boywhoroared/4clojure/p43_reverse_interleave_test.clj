(ns
 boywhoroared.4clojure.p43-reverse-interleave-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-43-test
 (testing
  "Problem 43: "
  (is (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
  (is (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
  (is (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))))

