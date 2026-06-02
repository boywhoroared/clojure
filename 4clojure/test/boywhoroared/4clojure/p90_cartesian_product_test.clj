(ns
 ^{:difficulty "easy", :tags ["set-theory"], :description "Write a function which calculates\nthe Cartesian product of two sets."} boywhoroared.4clojure.p90-cartesian-product-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-90-test
 (testing
  "Problem 90: Write a function which calculates\nthe Cartesian product of two sets."
  (is
   (=
    (__ #{"queen" "king" "ace"} #{"♣" "♠" "♥" "♦"})
    #{["ace" "♠"]
      ["queen" "♠"]
      ["ace" "♥"]
      ["ace" "♦"]
      ["king" "♣"]
      ["queen" "♣"]
      ["queen" "♥"]
      ["king" "♦"]
      ["ace" "♣"]
      ["queen" "♦"]
      ["king" "♥"]
      ["king" "♠"]}))
  (is (= (__ #{1 3 2} #{4 5}) #{[2 5] [3 4] [1 4] [1 5] [2 4] [3 5]}))
  (is
   (= 300 (count (__ (into #{} (range 10)) (into #{} (range 30))))))))

