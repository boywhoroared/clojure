(ns
 boywhoroared.4clojure.p77-anagram-finder-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-77-test
 (testing
  "Problem 77: "
  (is
   (=
    (__ ["meat" "mat" "team" "mate" "eat"])
    #{#{"meat" "mate" "team"}}))
  (is
   (=
    (__ ["veer" "lake" "item" "kale" "mite" "ever"])
    #{#{"kale" "lake"} #{"item" "mite"} #{"ever" "veer"}}))))

