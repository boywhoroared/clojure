(ns
 ^{:difficulty "hard", :tags ["game"], :description "As in Problem 73, a tic-tac-toe board\nis represented by a two dimensional vector.\nX is represented by :x, O is represented by :o,\nand empty is represented by :e.\nCreate a function that accepts a game piece and board as arguments,\nand returns a set (possibly empty) of all valid board placements\nof the game piece which would result in an immediate win.\n\nBoard coordinates should be as in calls to get-in.\nFor example, [0 1] is the topmost row, center position."} boywhoroared.4clojure.p119-win-at-tic-tac-toe-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-119-test
 (testing
  "Problem 119: As in Problem 73, a tic-tac-toe board\nis represented by a two dimensional vector.\nX is represented by :x, O is represented by :o,\nand empty is represented by :e.\nCreate a function that accepts a game piece and board as arguments,\nand returns a set (possibly empty) of all valid board placements\nof the game piece which would result in an immediate win.\n\nBoard coordinates should be as in calls to get-in.\nFor example, [0 1] is the topmost row, center position."
  (is
   (is
    (=
     (__ :x [[:o :e :e] [:o :x :o] [:x :x :e]])
     #{[2 2] [0 2] [0 1]})))
  (is
   (is
    (=
     (__ :x [[:x :o :o] [:x :x :e] [:e :o :e]])
     #{[2 2] [2 0] [1 2]})))
  (is
   (is
    (=
     (__ :x [[:x :e :x] [:o :x :o] [:e :o :e]])
     #{[2 2] [2 0] [0 1]})))
  (is (is (= (__ :x [[:x :x :o] [:e :e :e] [:e :e :e]]) #{})))
  (is
   (is (= (__ :o [[:x :x :o] [:o :e :o] [:x :e :e]]) #{[2 2] [1 1]})))))

