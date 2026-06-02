(ns
 ^{:difficulty "hard", :tags ["game"], :description "A tic-tac-toe board is represented by\na two dimensional vector.\nX is represented by :x, O is represented by :o,\nand empty is represented by :e.\nA player wins by placing three Xs or three Os\nin a horizontal, vertical, or diagonal row.\nWrite a function which analyzes a tic-tac-toe board\nand returns :x if X has won, :o if O has won,\nand nil if neither player has won."} boywhoroared.4clojure.p73-analyze-a-tic-tac-toe-board-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-73-test
 (testing
  "Problem 73: A tic-tac-toe board is represented by\na two dimensional vector.\nX is represented by :x, O is represented by :o,\nand empty is represented by :e.\nA player wins by placing three Xs or three Os\nin a horizontal, vertical, or diagonal row.\nWrite a function which analyzes a tic-tac-toe board\nand returns :x if X has won, :o if O has won,\nand nil if neither player has won."
  (is (= nil (__ [[:e :e :e] [:e :e :e] [:e :e :e]])))
  (is (= :x (__ [[:x :e :o] [:x :e :e] [:x :e :o]])))
  (is (= :o (__ [[:e :x :e] [:o :o :o] [:x :e :x]])))
  (is (= nil (__ [[:x :e :o] [:x :x :e] [:o :x :o]])))
  (is (= :x (__ [[:x :e :e] [:o :x :e] [:o :e :x]])))
  (is (= :o (__ [[:x :e :o] [:x :o :e] [:o :e :x]])))
  (is (= nil (__ [[:x :o :x] [:x :o :x] [:o :x :o]])))))

