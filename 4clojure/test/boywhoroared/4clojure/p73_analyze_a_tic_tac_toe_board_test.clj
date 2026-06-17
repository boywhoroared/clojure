(ns
  ^{:id 73 :difficulty "hard" :tags ["game"] :description "A tic-tac-toe board is represented by
a two dimensional vector.
X is represented by :x, O is represented by :o,
and empty is represented by :e.
A player wins by placing three Xs or three Os
in a horizontal, vertical, or diagonal row.
Write a function which analyzes a tic-tac-toe board
and returns :x if X has won, :o if O has won,
and nil if neither player has won."} boywhoroared.4clojure.p73-analyze-a-tic-tac-toe-board-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-73-test
     (testing "Problem 73: A tic-tac-toe board is represented by
a two dimensional vector.
X is represented by :x, O is represented by :o,
and empty is represented by :e.
A player wins by placing three Xs or three Os
in a horizontal, vertical, or diagonal row.
Write a function which analyzes a tic-tac-toe board
and returns :x if X has won, :o if O has won,
and nil if neither player has won."
       (is (= nil (__ [[:e :e :e]
            [:e :e :e]
            [:e :e :e]])))
(is (= :x (__ [[:x :e :o]
           [:x :e :e]
           [:x :e :o]])))
(is (= :o (__ [[:e :x :e]
           [:o :o :o]
           [:x :e :x]])))
(is (= nil (__ [[:x :e :o]
            [:x :x :e]
            [:o :x :o]])))
(is (= :x (__ [[:x :e :e]
           [:o :x :e]
           [:o :e :x]])))
(is (= :o (__ [[:x :e :o]
           [:x :o :e]
           [:o :e :x]])))
(is (= nil (__ [[:x :o :x]
            [:x :o :x]
            [:o :x :o]])))))