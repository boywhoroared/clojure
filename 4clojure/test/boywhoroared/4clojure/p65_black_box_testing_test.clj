(ns
  ^{:id 65 :difficulty "medium" :tags ["seqs" "testing"] :description "Clojure has many collection types,
which act in subtly different ways.
The core functions typically convert them into
a uniform "sequence" type and work with them that way,
but it can be important to understand the behavioral
and performance differences so that you know
which kind is appropriate for your application.
Write a function which takes a collection and returns one of:
map, :set, :list, or :vector -
describing the type of collection it was given.
You won't be allowed to inspect their class
or use the built-in predicates like list? -
the point is to poke at them and understand their behavior."} boywhoroared.4clojure.p65-black-box-testing-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-65-test
     (testing "Problem 65: Clojure has many collection types,
which act in subtly different ways.
The core functions typically convert them into
a uniform "sequence" type and work with them that way,
but it can be important to understand the behavioral
and performance differences so that you know
which kind is appropriate for your application.
Write a function which takes a collection and returns one of:
map, :set, :list, or :vector -
describing the type of collection it was given.
You won't be allowed to inspect their class
or use the built-in predicates like list? -
the point is to poke at them and understand their behavior."
       (is (= :map (__ {:a 1, :b 2})))
(is (= :list (__ (range (rand-int 20)))))
(is (= :vector (__ [1 2 3 4 5 6])))
(is (= :set (__ #{10 (rand-int 5)})))
(is (= [:map :set :vector :list] (map __ [{} #{} [] ()])))))