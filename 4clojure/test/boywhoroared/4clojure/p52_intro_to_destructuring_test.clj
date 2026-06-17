(ns
  ^{:id 52 :difficulty "elementary" :tags ["destructuring"] :description "Let bindings and function parameter lists
support destructuring."} boywhoroared.4clojure.p52-intro-to-destructuring-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-52-test
     (testing "Problem 52: Let bindings and function parameter lists
support destructuring."
       (is (= [2 4] (let [[a b c d e f g] (range)] __)))))