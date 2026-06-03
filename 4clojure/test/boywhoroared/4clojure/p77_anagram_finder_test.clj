(ns
 ^{:difficulty "medium", :tags [], :description "Write a function which\nfinds all the anagrams in a vector of words.\nA word x is an anagram of word y if all the letters in x\ncan be rearranged in a different order to form y.\nYour function should return a set of sets,\nwhere each sub-set is a group of words\nwhich are anagrams of each other.\nEach sub-set should have at least two words.\nWords without any anagrams should not be included in the result."} boywhoroared.4clojure.p77-anagram-finder-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-77-test
 (testing
  "Problem 77: Write a function which\nfinds all the anagrams in a vector of words.\nA word x is an anagram of word y if all the letters in x\ncan be rearranged in a different order to form y.\nYour function should return a set of sets,\nwhere each sub-set is a group of words\nwhich are anagrams of each other.\nEach sub-set should have at least two words.\nWords without any anagrams should not be included in the result."
  (is
   (=
    (__ ["meat" "mat" "team" "mate" "eat"])
    #{#{"meat" "mate" "team"}}))
  (is
   (=
    (__ ["veer" "lake" "item" "kale" "mite" "ever"])
    #{#{"kale" "lake"} #{"item" "mite"} #{"ever" "veer"}}))))

