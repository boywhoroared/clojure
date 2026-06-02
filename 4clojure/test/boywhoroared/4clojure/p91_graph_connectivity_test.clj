(ns
 ^{:difficulty "hard", :tags ["graph-theory"], :description "Given a graph, determine whether the graph is connected.\nA connected graph is such that\na path exists between any two given nodes.\n\n-Your function must return true if\n the graph is connected and false otherwise.\n\n-You will be given a set of tuples\n representing the edges of a graph.\n Each member of a tuple being a vertex/node in the graph.\n\n-Each edge is undirected (can be traversed either direction)."} boywhoroared.4clojure.p91-graph-connectivity-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-91-test
 (testing
  "Problem 91: Given a graph, determine whether the graph is connected.\nA connected graph is such that\na path exists between any two given nodes.\n\n-Your function must return true if\n the graph is connected and false otherwise.\n\n-You will be given a set of tuples\n representing the edges of a graph.\n Each member of a tuple being a vertex/node in the graph.\n\n-Each edge is undirected (can be traversed either direction)."
  (is (= true (__ #{[:a :a]})))
  (is (= true (__ #{[:a :b]})))
  (is (= false (__ #{[2 3] [6 4] [5 6] [4 5] [3 1] [1 2]})))
  (is (= true (__ #{[2 3] [3 4] [6 4] [5 6] [4 5] [3 1] [1 2]})))
  (is
   (= false (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:b :c]})))
  (is
   (=
    true
    (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:x :a] [:b :c]})))))

