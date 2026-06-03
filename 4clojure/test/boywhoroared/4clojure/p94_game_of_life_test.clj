(ns
 ^{:difficulty "hard", :tags ["game"], :description "The game of life is a cellular automaton\ndevised by mathematician John Conway.\n\nThe 'board' consists of both live (#) and dead ( ) cells.\nEach cell interacts with its eight neighbours\n(horizontal, vertical, diagonal),\nand its next state is dependent on the following rules:\n\n1) Any live cell with fewer than two live neighbours dies,\n   as if caused by under-population.\n2) Any live cell with two or three live neighbours\n   lives on to the next generation.\n3) Any live cell with more than three live neighbours dies,\n   as if by overcrowding.\n4) Any dead cell with exactly three live neighbours\n   becomes a live cell, as if by reproduction.\n\nWrite a function that accepts a board,\nand returns a board representing the next generation of cells."} boywhoroared.4clojure.p94-game-of-life-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-94-test
 (testing
  "Problem 94: The game of life is a cellular automaton\ndevised by mathematician John Conway.\n\nThe 'board' consists of both live (#) and dead ( ) cells.\nEach cell interacts with its eight neighbours\n(horizontal, vertical, diagonal),\nand its next state is dependent on the following rules:\n\n1) Any live cell with fewer than two live neighbours dies,\n   as if caused by under-population.\n2) Any live cell with two or three live neighbours\n   lives on to the next generation.\n3) Any live cell with more than three live neighbours dies,\n   as if by overcrowding.\n4) Any dead cell with exactly three live neighbours\n   becomes a live cell, as if by reproduction.\n\nWrite a function that accepts a board,\nand returns a board representing the next generation of cells."
  (is
   (=
    (__ ["      " " ##   " " ##   " "   ## " "   ## " "      "])
    ["      " " ##   " " #    " "    # " "   ## " "      "]))
  (is
   (=
    (__ ["     " "     " " ### " "     " "     "])
    ["     " "  #  " "  #  " "  #  " "     "]))
  (is
   (=
    (__ ["      " "      " "  ### " " ###  " "      " "      "])
    ["      " "   #  " " #  # " " #  # " "  #   " "      "]))))

