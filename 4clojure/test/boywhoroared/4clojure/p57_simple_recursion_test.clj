(ns
  ^{:id 57 :difficulty "elementary" :tags ["recursion"] :description "A recursive function is a function which calls itself.
This is one of the fundamental techniques
used in functional programming."} boywhoroared.4clojure.p57-simple-recursion-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-57-test
     (testing "Problem 57: A recursive function is a function which calls itself.
This is one of the fundamental techniques
used in functional programming."
       (is (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))