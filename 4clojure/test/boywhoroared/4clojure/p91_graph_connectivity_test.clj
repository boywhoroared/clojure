(ns
  ^{:id 91 :difficulty "hard" :tags ["graph-theory"] :description "Given a graph, determine whether the graph is connected.
A connected graph is such that
a path exists between any two given nodes.

-Your function must return true if
 the graph is connected and false otherwise.

-You will be given a set of tuples
 representing the edges of a graph.
 Each member of a tuple being a vertex/node in the graph.

-Each edge is undirected (can be traversed either direction)."} boywhoroared.4clojure.p91-graph-connectivity-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-91-test
     (testing "Problem 91: Given a graph, determine whether the graph is connected.
A connected graph is such that
a path exists between any two given nodes.

-Your function must return true if
 the graph is connected and false otherwise.

-You will be given a set of tuples
 representing the edges of a graph.
 Each member of a tuple being a vertex/node in the graph.

-Each edge is undirected (can be traversed either direction)."
       (is (= true (__ #{[:a :a]})))
(is (= true (__ #{[:a :b]})))
(is (= false (__ #{[1 2] [2 3] [3 1]
               [4 5] [5 6] [6 4]})))
(is (= true (__ #{[1 2] [2 3] [3 1]
              [4 5] [5 6] [6 4] [3 4]})))
(is (= false (__ #{[:a :b] [:b :c] [:c :d]
               [:x :y] [:d :a] [:b :e]})))
(is (= true (__ #{[:a :b] [:b :c] [:c :d]
              [:x :y] [:d :a] [:b :e] [:x :a]})))))