(ns
 boywhoroared.4clojure.p82-word-chains-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-82-test
 (testing
  "Problem 82: "
  (is
   (= true (__ #{"dog" "oat" "cot" "coat" "hot" "hat" "hog" "cat"})))
  (is (= false (__ #{"cot" "hot" "bat" "fat"})))
  (is (= false (__ #{"stop" "top" "tops" "toss" "to"})))
  (is (= true (__ #{"spot" "pot" "spout" "dot" "pout" "do"})))
  (is (= true (__ #{"shares" "are" "hare" "hares" "share"})))
  (is (= false (__ #{"are" "hare" "hares" "share"})))))

