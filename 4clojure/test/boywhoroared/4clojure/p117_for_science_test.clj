(ns
  ^{:id 117 :difficulty "hard" :tags ["game"] :description "A mad scientist with tenure has created
an experiment tracking mice in a maze.
Several mazes have been randomly generated,
and you’ve been tasked with writing a program to determine
the mazes in which it’s possible for the mouse
to reach the cheesy endpoint.
Write a function which accepts a maze
in the form of a collection of rows,
each row is a string where:

* spaces represent areas where the mouse can walk freely
* hashes (#) represent walls where the mouse can not walk
* M represents the mouse’s starting point
* C represents the cheese which the mouse must reach
* The mouse is not allowed to travel diagonally
in the maze (only up/down/left/right),
nor can he escape the edge of the maze.
Your function must return true
iff the maze is solvable by the mouse."} boywhoroared.4clojure.p117-for-science-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-117-test
     (testing "Problem 117: A mad scientist with tenure has created
an experiment tracking mice in a maze.
Several mazes have been randomly generated,
and you’ve been tasked with writing a program to determine
the mazes in which it’s possible for the mouse
to reach the cheesy endpoint.
Write a function which accepts a maze
in the form of a collection of rows,
each row is a string where:

* spaces represent areas where the mouse can walk freely
* hashes (#) represent walls where the mouse can not walk
* M represents the mouse’s starting point
* C represents the cheese which the mouse must reach
* The mouse is not allowed to travel diagonally
in the maze (only up/down/left/right),
nor can he escape the edge of the maze.
Your function must return true
iff the maze is solvable by the mouse."
       (is (= true  (__ ["M   C"])))
(is (= false (__ ["M # C"])))
(is (= true  (__ ["#######"
                                "#     #"
                                "#  #  #"
                                "#M # C#"
                                "#######"])))
(is (= false (__ ["########"
                                "#M  #  #"
                                "#   #  #"
                                "# # #  #"
                                "#   #  #"
                                "#  #   #"
                                "#  # # #"
                                "#  #   #"
                                "#  #  C#"
                                "########"])))
(is (= false (__ ["M     "
                                "      "
                                "      "
                                "      "
                                "    ##"
                                "    #C"])))
(is (= true  (__ ["C######"
                                " #     "
                                " #   # "
                                " #   #M"
                                "     # "])))
(is (= true  (__ ["C# # # #"
                                "        "
                                "# # # # "
                                "        "
                                " # # # #"
                                "        "
                                "# # # #M"])))))