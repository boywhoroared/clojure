(ns
 ^{:difficulty "hard", :tags ["numbers"], :description "Given a pair of numbers, the start and end point,\nfind a path between the two using only three possible operations:\n\n1. double\n2. halve (odd numbers cannot be halved)\n3. add 2\n\nFind the shortest path through the “maze”.\nBecause there are multiple shortest paths,\nyou must return the length of the shortest path, not the path itself."} boywhoroared.4clojure.p106-number-maze-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-106-test
 (testing
  "Problem 106: Given a pair of numbers, the start and end point,\nfind a path between the two using only three possible operations:\n\n1. double\n2. halve (odd numbers cannot be halved)\n3. add 2\n\nFind the shortest path through the “maze”.\nBecause there are multiple shortest paths,\nyou must return the length of the shortest path, not the path itself."
  (is (= 1 (__ 1 1)))
  (is (= 3 (__ 3 12)))
  (is (= 3 (__ 12 3)))
  (is (= 3 (__ 5 9)))
  (is (= 9 (__ 9 2)))
  (is (= 5 (__ 9 12)))))

