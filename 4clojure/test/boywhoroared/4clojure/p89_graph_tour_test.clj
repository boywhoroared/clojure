(ns
 ^{:difficulty "hard", :tags ["graph-theory"], :description "Starting with a graph you must write a function\nthat returns true if it is possible to make\na tour of the graph in which every edge is visited exactly once.\n\nThe graph is represented by a vector of tuples,\nwhere each tuple represents a single edge.\n\nThe rules are:\n\n- You can start at any node.\n- You must visit each edge exactly once.\n- All edges are undirected."} boywhoroared.4clojure.p89-graph-tour-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-89-test
 (testing
  "Problem 89: Starting with a graph you must write a function\nthat returns true if it is possible to make\na tour of the graph in which every edge is visited exactly once.\n\nThe graph is represented by a vector of tuples,\nwhere each tuple represents a single edge.\n\nThe rules are:\n\n- You can start at any node.\n- You must visit each edge exactly once.\n- All edges are undirected."
  (is (= true (__ [[:a :b]])))
  (is (= false (__ [[:a :a] [:b :b]])))
  (is
   (=
    false
    (__ [[:a :b] [:a :b] [:a :c] [:c :a] [:a :d] [:b :d] [:c :d]])))
  (is (= true (__ [[1 2] [2 3] [3 4] [4 1]])))
  (is
   (=
    true
    (__
     [[:a :b]
      [:a :c]
      [:c :b]
      [:a :e]
      [:b :e]
      [:a :d]
      [:b :d]
      [:c :e]
      [:d :e]
      [:c :f]
      [:d :f]])))
  (is (= false (__ [[1 2] [2 3] [2 4] [2 5]])))))

