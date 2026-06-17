(ns
  ^{:id 82 :difficulty "hard" :tags ["seqs"] :description "A word chain consists of
a set of words ordered so that each word differs
by only one letter from the words directly before and after it.
The one letter difference can be either an insertion,
a deletion, or a substitution.

Here is an example word chain:

cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog

Write a function which takes a sequence of words,
and returns true if they can be
arranged into one continous word chain,
and false if they cannot."} boywhoroared.4clojure.p82-word-chains-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-82-test
     (testing "Problem 82: A word chain consists of
a set of words ordered so that each word differs
by only one letter from the words directly before and after it.
The one letter difference can be either an insertion,
a deletion, or a substitution.

Here is an example word chain:

cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog

Write a function which takes a sequence of words,
and returns true if they can be
arranged into one continous word chain,
and false if they cannot."
       (is (= true (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})))
(is (= false (__ #{"cot" "hot" "bat" "fat"})))
(is (= false (__ #{"to" "top" "stop" "tops" "toss"})))
(is (= true (__ #{"spout" "do" "pot" "pout" "spot" "dot"})))
(is (= true (__ #{"share" "hares" "shares" "hare" "are"})))
(is (= false (__ #{"share" "hares" "hare" "are"})))))