(ns
 boywhoroared.4clojure.p72-rearranging-code---test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-72-test
  (testing
   "Problem 72: "
    (is
     (=
      (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
      (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
      11))))

