(ns
  ^{:id 106 :difficulty "hard" :tags ["numbers"] :description "Given a pair of numbers, the start and end point,
find a path between the two using only three possible operations:

1. double
2. halve (odd numbers cannot be halved)
3. add 2

Find the shortest path through the “maze”.
Because there are multiple shortest paths,
you must return the length of the shortest path, not the path itself."} boywhoroared.4clojure.p106-number-maze-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-106-test
     (testing "Problem 106: Given a pair of numbers, the start and end point,
find a path between the two using only three possible operations:

1. double
2. halve (odd numbers cannot be halved)
3. add 2

Find the shortest path through the “maze”.
Because there are multiple shortest paths,
you must return the length of the shortest path, not the path itself."
       (is (= 1 (__ 1 1)))
(is (= 3 (__ 3 12)))
(is (= 3 (__ 12 3)))
(is (= 3 (__ 5 9)))
(is (= 9 (__ 9 2)))
(is (= 5 (__ 9 12)))))