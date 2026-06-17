(ns
  ^{:id 84 :difficulty "hard" :tags ["set-theory"] :description "Write a function which generates
the transitive closure of a binary relation.
The relation will be represented as a set of 2 item vectors."} boywhoroared.4clojure.p84-transitive-closure-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-84-test
     (testing "Problem 84: Write a function which generates
the transitive closure of a binary relation.
The relation will be represented as a set of 2 item vectors."
       (is (let [divides #{[8 4] [9 3] [4 2] [27 9]}]
  (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]})))
(is (let [more-legs
      #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]
  (= (__ more-legs)
     #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
       ["spider" "cat"] ["spider" "man"] ["spider" "snake"]})))
(is (let [progeny
      #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]
  (= (__ progeny)
     #{["father" "son"] ["father" "grandson"]
       ["uncle" "cousin"] ["son" "grandson"]})))))