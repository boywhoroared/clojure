(ns
 ^{:difficulty "medium", :tags ["core-functions"], :description "Write a function which takes\na function f and a variable number of maps.\nYour function should return a map\nthat consists of the rest of the maps conj-ed onto the first.\nIf a key occurs in more than one map,\nthe mapping(s) from the latter (left-to-right)\nshould be combined with the mapping in the result\nby calling (f val-in-result val-in-latter)"} boywhoroared.4clojure.p69-merge-with-a-function-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-69-test
 (testing
  "Problem 69: Write a function which takes\na function f and a variable number of maps.\nYour function should return a map\nthat consists of the rest of the maps conj-ed onto the first.\nIf a key occurs in more than one map,\nthe mapping(s) from the latter (left-to-right)\nshould be combined with the mapping in the result\nby calling (f val-in-result val-in-latter)"
  (is
   (=
    (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
    {:a 4, :b 6, :c 20}))
  (is (= (__ - {1 10, 2 20} {1 3, 2 10, 3 15}) {1 7, 2 10, 3 15}))
  (is
   (=
    (__ concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
    {:a [3 4 5], :b [6 7], :c [8 9]}))))

