(ns
 boywhoroared.4clojure.p71-rearranging-code---test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-71-test
  (testing
   "Problem 71: "
    (is
     (=
      (__ (sort (rest (reverse [2 5 4 1 3 6]))))
      (-> [2 5 4 1 3 6] reverse rest sort __)
      5))))

