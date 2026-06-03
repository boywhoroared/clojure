(ns
 ^{:difficulty "easy", :tags [], :description "Pascal's triangle is a triangle of numbers\ncomputed using the following rules:\n\n- The first row is 1.\n- Each successive row is computed by\n  adding together adjacent numbers in the row above,\nand adding a 1 to the beginning and end of the row.\n\nWrite a function which returns\n:the nth row of Pascal's Triangle."} boywhoroared.4clojure.p97-pascals-triangle-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-97-test
 (testing
  "Problem 97: Pascal's triangle is a triangle of numbers\ncomputed using the following rules:\n\n- The first row is 1.\n- Each successive row is computed by\n  adding together adjacent numbers in the row above,\nand adding a 1 to the beginning and end of the row.\n\nWrite a function which returns\n:the nth row of Pascal's Triangle."
  (is (= (__ 1) [1]))
  (is
   (= (map __ (range 1 6)) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
  (is (= (__ 11) [1 10 45 120 210 252 210 120 45 10 1]))
  (is (= (__ 11) [1 10 45 120 210 252 210 120 45 10 1]))))

