(ns
  ^{:id 124 :difficulty "hard" :tags ["game"] :description "Reversi is normally played on an 8 by 8 board.
In this problem, a 4 by 4 board is represented
as a two-dimensional vector
with black, white, and empty pieces represented
by ‘b, ‘w, and ‘e, respectively.
Create a function that accepts
a game board and color as arguments,
and returns a map of legal moves for that color.
Each key should be the coordinates of a legal move,
and its value a set of the coordinates
of the pieces flipped by that move.

Board coordinates should be as in calls to get-in.
For example, [0 1] is the topmost row,
second column from the left."} boywhoroared.4clojure.p124-analyze-reversi-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-124-test
     (testing "Problem 124: Reversi is normally played on an 8 by 8 board.
In this problem, a 4 by 4 board is represented
as a two-dimensional vector
with black, white, and empty pieces represented
by ‘b, ‘w, and ‘e, respectively.
Create a function that accepts
a game board and color as arguments,
and returns a map of legal moves for that color.
Each key should be the coordinates of a legal move,
and its value a set of the coordinates
of the pieces flipped by that move.

Board coordinates should be as in calls to get-in.
For example, [0 1] is the topmost row,
second column from the left."
       (is (= {[1 3] #{[1 2]}
                       [0 2] #{[1 2]}
                       [3 1] #{[2 1]}
                       [2 0] #{[2 1]}}
                      (__ '[[e e e e]
                                 [e w b e]
                                 [e b w e]
                                 [e e e e]] 'w)))
(is (= {[3 2] #{[2 2]}
                       [3 0] #{[2 1]}
                       [1 0] #{[1 1]}}
                      (__ '[[e e e e]
                                 [e w b e]
                                 [w w w e]
                                 [e e e e]] 'b)))
(is (= {[0 3] #{[1 2]}
                       [1 3] #{[1 2]}
                       [3 3] #{[2 2]}
                       [2 3] #{[2 2]}}
                      (__ '[[e e e e]
                                 [e w b e]
                                 [w w b e]
                                 [e e b e]] 'w)))
(is (= {[0 3] #{[2 1] [1 2]}
                       [1 3] #{[1 2]}
                       [2 3] #{[2 1] [2 2]}}
                      (__ '[[e e w e]
                                 [b b w e]
                                 [b w w e]
                                 [b w w w]] 'b)))
(is (= {[0 3] #{[2 1] [1 2]}
                       [1 3] #{[1 2]}
                       [2 3] #{[2 1] [2 2]}}
                      (__ '[[e e w e]
                                 [b b w e]
                                 [b w w e]
                                 [b w w w]] 'b)))))