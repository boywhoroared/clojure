(ns
  ^{:id 89 :difficulty "hard" :tags ["graph-theory"] :description "Starting with a graph you must write a function
that returns true if it is possible to make
a tour of the graph in which every edge is visited exactly once.

The graph is represented by a vector of tuples,
where each tuple represents a single edge.

The rules are:

- You can start at any node.
- You must visit each edge exactly once.
- All edges are undirected."} boywhoroared.4clojure.p89-graph-tour-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-89-test
     (testing "Problem 89: Starting with a graph you must write a function
that returns true if it is possible to make
a tour of the graph in which every edge is visited exactly once.

The graph is represented by a vector of tuples,
where each tuple represents a single edge.

The rules are:

- You can start at any node.
- You must visit each edge exactly once.
- All edges are undirected."
       (is (= true (__ [[:a :b]])))
(is (= false (__ [[:a :a] [:b :b]])))
(is (= false (__ [[:a :b] [:a :b] [:a :c] [:c :a]
               [:a :d] [:b :d] [:c :d]])))
(is (= true (__ [[1 2] [2 3] [3 4] [4 1]])))
(is (= true (__ [[:a :b] [:a :c] [:c :b] [:a :e]
              [:b :e] [:a :d] [:b :d] [:c :e]
              [:d :e] [:c :f] [:d :f]])))
(is (= false (__ [[1 2] [2 3] [2 4] [2 5]])))))