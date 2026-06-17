(ns
  ^{:id 47 :difficulty "easy" :tags [] :description "The contains? function checks if a KEY
is present in a given collection.
This often leads beginner clojurians to use it incorrectly
with numerically indexed collections like vectors and lists."} boywhoroared.4clojure.p47-contain-yourself-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-47-test
     (testing "Problem 47: The contains? function checks if a KEY
is present in a given collection.
This often leads beginner clojurians to use it incorrectly
with numerically indexed collections like vectors and lists."
       (is (contains? #{4 5 6} __))
(is (contains? [1 1 1 1 1] __))
(is (contains? {4 :a 2 :b} __))
(is (not (contains? [1 2 4] __)))))