(ns
 boywhoroared.4clojure.p84-transitive-closure-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-84-test
 (testing
  "Problem 84: "
  (is
   (let
    [divides #{[27 9] [8 4] [4 2] [9 3]}]
    (= (__ divides) #{[27 9] [27 3] [8 4] [4 2] [9 3] [8 2]})))
  (is
   (let
    [more-legs #{["man" "snake"] ["cat" "man"] ["spider" "cat"]}]
    (=
     (__ more-legs)
     #{["man" "snake"]
       ["spider" "man"]
       ["cat" "man"]
       ["cat" "snake"]
       ["spider" "snake"]
       ["spider" "cat"]})))
  (is
   (let
    [progeny #{["son" "grandson"] ["uncle" "cousin"] ["father" "son"]}]
    (=
     (__ progeny)
     #{["son" "grandson"]
       ["uncle" "cousin"]
       ["father" "son"]
       ["father" "grandson"]})))))

