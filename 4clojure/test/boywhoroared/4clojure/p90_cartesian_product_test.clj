(ns
  ^{:id 90 :difficulty "easy" :tags ["set-theory"] :description "Write a function which calculates
the Cartesian product of two sets."} boywhoroared.4clojure.p90-cartesian-product-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-90-test
     (testing "Problem 90: Write a function which calculates
the Cartesian product of two sets."
       (is (= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
   #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
     ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
     ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))
(is (= (__ #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
(is (= 300 (count (__ (into #{} (range 10))
                  (into #{} (range 30))))))))