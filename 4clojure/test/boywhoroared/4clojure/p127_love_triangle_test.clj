(ns
 ^{:difficulty "hard", :tags ["search" "data-juggling"], :description "Everyone loves triangles,\nand it’s easy to understand why —\nthey’re so wonderfully symmetric\n(except scalenes, they suck).\n\nYour passion for triangles has led you to become a miner\n(and part-time Clojure programmer) where you work all day\nto chip out isosceles-shaped minerals from rocks\ngathered in a nearby open-pit mine.\nThere are too many rocks coming from the mine to harvest them all\nso you’ve been tasked with writing a program\nto analyze the mineral patterns of each rock,\nand determine which rocks have the biggest minerals.\n\nSomeone has already written a computer-vision system for the mine.\nIt images each rock as it comes into the processing centre\nand creates a cross-sectional bitmap of mineral (1)\nand rock (0) concentrations for each one.\n\nYou must now create a function which\naccepts a collection of integers,\neach integer when read in base-2\ngives the bit-representation of the rock\n(again, 1s are mineral and 0s are worthless scalene-like rock).\nYou must return the cross-sectional area of\nthe largest harvestable mineral from the input rock, as follows:\n\nThe minerals only have smooth faces when\nsheared vertically or horizontally from the rock’s cross-section\nThe mine is only concerned with harvesting\nisosceles triangles (such that one or two sides can be sheared)\nIf only one face of the mineral is sheared,\nits opposing vertex must be a point\n(ie. the smooth face must be of odd length),\nand its two equal-length sides must intersect\nthe shear face at 45° (ie. those sides must cut even-diagonally)\nThe harvested mineral may not contain any traces of rock\nThe mineral may lie in any orientation in the plane\nArea should be calculated as the sum of 1s that comprise the mineral\nMinerals must have a minimum of three measures of area to be harvested\nIf no minerals can be harvested from the rock,\nyour function should return nil"} boywhoroared.4clojure.p127-love-triangle-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-127-test
 (testing
  "Problem 127: Everyone loves triangles,\nand it’s easy to understand why —\nthey’re so wonderfully symmetric\n(except scalenes, they suck).\n\nYour passion for triangles has led you to become a miner\n(and part-time Clojure programmer) where you work all day\nto chip out isosceles-shaped minerals from rocks\ngathered in a nearby open-pit mine.\nThere are too many rocks coming from the mine to harvest them all\nso you’ve been tasked with writing a program\nto analyze the mineral patterns of each rock,\nand determine which rocks have the biggest minerals.\n\nSomeone has already written a computer-vision system for the mine.\nIt images each rock as it comes into the processing centre\nand creates a cross-sectional bitmap of mineral (1)\nand rock (0) concentrations for each one.\n\nYou must now create a function which\naccepts a collection of integers,\neach integer when read in base-2\ngives the bit-representation of the rock\n(again, 1s are mineral and 0s are worthless scalene-like rock).\nYou must return the cross-sectional area of\nthe largest harvestable mineral from the input rock, as follows:\n\nThe minerals only have smooth faces when\nsheared vertically or horizontally from the rock’s cross-section\nThe mine is only concerned with harvesting\nisosceles triangles (such that one or two sides can be sheared)\nIf only one face of the mineral is sheared,\nits opposing vertex must be a point\n(ie. the smooth face must be of odd length),\nand its two equal-length sides must intersect\nthe shear face at 45° (ie. those sides must cut even-diagonally)\nThe harvested mineral may not contain any traces of rock\nThe mineral may lie in any orientation in the plane\nArea should be calculated as the sum of 1s that comprise the mineral\nMinerals must have a minimum of three measures of area to be harvested\nIf no minerals can be harvested from the rock,\nyour function should return nil"
  (is (= 10 (__ [15 15 15 15 15])))
  (is (= 15 (__ [1 3 7 15 31])))
  (is (= 3 (__ [3 3])))
  (is (= 4 (__ [7 3])))
  (is (= 6 (__ [17 22 6 14 22])))
  (is (= 9 (__ [18 7 14 14 6 3])))
  (is (= nil (__ [21 10 21 10])))
  (is (= nil (__ [0 31 0 31 0])))))

