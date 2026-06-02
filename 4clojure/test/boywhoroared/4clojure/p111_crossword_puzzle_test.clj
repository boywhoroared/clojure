(ns
 boywhoroared.4clojure.p111-crossword-puzzle-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-111-test
  (testing
   "Problem 111: "
    (is (= true (__ "the" ["_ # _ _ e"])))
    (is (= false (__ "the" ["c _ _ _" "d _ # e" "r y _ _"])))
    (is (= true (__ "joy" ["c _ _ _" "d _ # e" "r y _ _"])))
    (is (= false (__ "joy" ["c o n j" "_ _ y _" "r _ _ #"])))
    (is
     (=
      true
      (__ "clojure" ["_ _ _ # j o y" "_ _ o _ _ _ _" "_ _ f _ # _ _"])))))

