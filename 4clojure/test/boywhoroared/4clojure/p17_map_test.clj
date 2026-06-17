(ns
  ^{:id 17 :difficulty "elementary" :tags [] :description "The map function takes two arguments:
a function (f) and a sequence (s).
Map returns a new sequence consisting of
the result of applying f to each item of s.
Do not confuse the map function with the map data structure."} boywhoroared.4clojure.p17-map-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-17-test
     (testing "Problem 17: The map function takes two arguments:
a function (f) and a sequence (s).
Map returns a new sequence consisting of
the result of applying f to each item of s.
Do not confuse the map function with the map data structure."
       (is (= __ (map #(+ % 5) '(1 2 3))))))