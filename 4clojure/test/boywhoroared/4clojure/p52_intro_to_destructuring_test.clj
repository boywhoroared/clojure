(ns
 ^{:difficulty "elementary", :tags ["destructuring"], :description "Let bindings and function parameter lists\nsupport destructuring."} boywhoroared.4clojure.p52-intro-to-destructuring-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-52-test
 (testing
  "Problem 52: Let bindings and function parameter lists\nsupport destructuring."
  (is (= [2 4] (let [[a b c d e f g] (range)] __)))))

