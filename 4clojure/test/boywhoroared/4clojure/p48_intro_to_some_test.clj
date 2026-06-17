(ns
  ^{:id 48 :difficulty "easy" :tags [] :description "The some function takes
a predicate function and a collection.
It returns the first logical true value of (predicate x)
where x is an item in the collection."} boywhoroared.4clojure.p48-intro-to-some-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-48-test
     (testing "Problem 48: The some function takes
a predicate function and a collection.
It returns the first logical true value of (predicate x)
where x is an item in the collection."
       (is (= __ (some #{2 7 6} [5 6 7 8])))
(is (= __ (some #(when (even? %) %) [5 6 7 8])))))