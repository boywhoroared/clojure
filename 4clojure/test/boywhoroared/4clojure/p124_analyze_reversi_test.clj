(ns
 ^{:difficulty "hard", :tags ["game"], :description "Reversi is normally played on an 8 by 8 board.\nIn this problem, a 4 by 4 board is represented\nas a two-dimensional vector\nwith black, white, and empty pieces represented\nby ‘b, ‘w, and ‘e, respectively.\nCreate a function that accepts\na game board and color as arguments,\nand returns a map of legal moves for that color.\nEach key should be the coordinates of a legal move,\nand its value a set of the coordinates\nof the pieces flipped by that move.\n\nBoard coordinates should be as in calls to get-in.\nFor example, [0 1] is the topmost row,\nsecond column from the left."} boywhoroared.4clojure.p124-analyze-reversi-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-124-test
 (testing
  "Problem 124: Reversi is normally played on an 8 by 8 board.\nIn this problem, a 4 by 4 board is represented\nas a two-dimensional vector\nwith black, white, and empty pieces represented\nby ‘b, ‘w, and ‘e, respectively.\nCreate a function that accepts\na game board and color as arguments,\nand returns a map of legal moves for that color.\nEach key should be the coordinates of a legal move,\nand its value a set of the coordinates\nof the pieces flipped by that move.\n\nBoard coordinates should be as in calls to get-in.\nFor example, [0 1] is the topmost row,\nsecond column from the left."
  (is
   (=
    {[1 3] #{[1 2]}, [0 2] #{[1 2]}, [3 1] #{[2 1]}, [2 0] #{[2 1]}}
    (__ '[[e e e e] [e w b e] [e b w e] [e e e e]] 'w)))
  (is
   (=
    {[3 2] #{[2 2]}, [3 0] #{[2 1]}, [1 0] #{[1 1]}}
    (__ '[[e e e e] [e w b e] [w w w e] [e e e e]] 'b)))
  (is
   (=
    {[0 3] #{[1 2]}, [1 3] #{[1 2]}, [3 3] #{[2 2]}, [2 3] #{[2 2]}}
    (__ '[[e e e e] [e w b e] [w w b e] [e e b e]] 'w)))
  (is
   (=
    {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 2] [2 1]}}
    (__ '[[e e w e] [b b w e] [b w w e] [b w w w]] 'b)))
  (is
   (=
    {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 2] [2 1]}}
    (__ '[[e e w e] [b b w e] [b w w e] [b w w w]] 'b)))))

