(ns
 ^{:difficulty "hard", :tags ["seqs"], :description "A word chain consists of\na set of words ordered so that each word differs\nby only one letter from the words directly before and after it.\nThe one letter difference can be either an insertion,\na deletion, or a substitution.\n\nHere is an example word chain:\n\ncat -> cot -> coat -> oat -> hat -> hot -> hog -> dog\n\nWrite a function which takes a sequence of words,\nand returns true if they can be\narranged into one continous word chain,\nand false if they cannot."} boywhoroared.4clojure.p82-word-chains-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-82-test
 (testing
  "Problem 82: A word chain consists of\na set of words ordered so that each word differs\nby only one letter from the words directly before and after it.\nThe one letter difference can be either an insertion,\na deletion, or a substitution.\n\nHere is an example word chain:\n\ncat -> cot -> coat -> oat -> hat -> hot -> hog -> dog\n\nWrite a function which takes a sequence of words,\nand returns true if they can be\narranged into one continous word chain,\nand false if they cannot."
  (is
   (= true (__ #{"dog" "oat" "cot" "coat" "hot" "hat" "hog" "cat"})))
  (is (= false (__ #{"cot" "hot" "bat" "fat"})))
  (is (= false (__ #{"stop" "top" "tops" "toss" "to"})))
  (is (= true (__ #{"spot" "pot" "spout" "dot" "pout" "do"})))
  (is (= true (__ #{"shares" "are" "hare" "hares" "share"})))
  (is (= false (__ #{"are" "hare" "hares" "share"})))))

