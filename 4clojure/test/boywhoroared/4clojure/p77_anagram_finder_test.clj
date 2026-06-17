(ns
  ^{:id 77 :difficulty "medium" :tags [] :description "Write a function which
finds all the anagrams in a vector of words.
A word x is an anagram of word y if all the letters in x
can be rearranged in a different order to form y.
Your function should return a set of sets,
where each sub-set is a group of words
which are anagrams of each other.
Each sub-set should have at least two words.
Words without any anagrams should not be included in the result."} boywhoroared.4clojure.p77-anagram-finder-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-77-test
     (testing "Problem 77: Write a function which
finds all the anagrams in a vector of words.
A word x is an anagram of word y if all the letters in x
can be rearranged in a different order to form y.
Your function should return a set of sets,
where each sub-set is a group of words
which are anagrams of each other.
Each sub-set should have at least two words.
Words without any anagrams should not be included in the result."
       (is (= (__ ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}}))
(is (= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}))))