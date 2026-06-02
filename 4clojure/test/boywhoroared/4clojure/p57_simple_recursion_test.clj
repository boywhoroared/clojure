(ns
 ^{:difficulty "elementary", :tags ["recursion"], :description "A recursive function is a function which calls itself.\nThis is one of the fundamental techniques\nused in functional programming."} boywhoroared.4clojure.p57-simple-recursion-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-57-test
 (testing
  "Problem 57: A recursive function is a function which calls itself.\nThis is one of the fundamental techniques\nused in functional programming."
  (is (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))

