(ns
 ^{:difficulty "hard", :tags ["game"], :description "A mad scientist with tenure has created\nan experiment tracking mice in a maze.\nSeveral mazes have been randomly generated,\nand you’ve been tasked with writing a program to determine\nthe mazes in which it’s possible for the mouse\nto reach the cheesy endpoint.\nWrite a function which accepts a maze\nin the form of a collection of rows,\neach row is a string where:\n\n* spaces represent areas where the mouse can walk freely\n* hashes (#) represent walls where the mouse can not walk\n* M represents the mouse’s starting point\n* C represents the cheese which the mouse must reach\n* The mouse is not allowed to travel diagonally\nin the maze (only up/down/left/right),\nnor can he escape the edge of the maze.\nYour function must return true\niff the maze is solvable by the mouse."} boywhoroared.4clojure.p117-for-science-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-117-test
 (testing
  "Problem 117: A mad scientist with tenure has created\nan experiment tracking mice in a maze.\nSeveral mazes have been randomly generated,\nand you’ve been tasked with writing a program to determine\nthe mazes in which it’s possible for the mouse\nto reach the cheesy endpoint.\nWrite a function which accepts a maze\nin the form of a collection of rows,\neach row is a string where:\n\n* spaces represent areas where the mouse can walk freely\n* hashes (#) represent walls where the mouse can not walk\n* M represents the mouse’s starting point\n* C represents the cheese which the mouse must reach\n* The mouse is not allowed to travel diagonally\nin the maze (only up/down/left/right),\nnor can he escape the edge of the maze.\nYour function must return true\niff the maze is solvable by the mouse."
  (is (= true (__ ["M   C"])))
  (is (= false (__ ["M # C"])))
  (is
   (= true (__ ["#######" "#     #" "#  #  #" "#M # C#" "#######"])))
  (is
   (=
    false
    (__
     ["########"
      "#M  #  #"
      "#   #  #"
      "# # #  #"
      "#   #  #"
      "#  #   #"
      "#  # # #"
      "#  #   #"
      "#  #  C#"
      "########"])))
  (is
   (=
    false
    (__ ["M     " "      " "      " "      " "    ##" "    #C"])))
  (is
   (= true (__ ["C######" " #     " " #   # " " #   #M" "     # "])))
  (is
   (=
    true
    (__
     ["C# # # #"
      "        "
      "# # # # "
      "        "
      " # # # #"
      "        "
      "# # # #M"])))))

