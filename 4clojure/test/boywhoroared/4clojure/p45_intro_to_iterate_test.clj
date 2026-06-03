(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "The iterate function can be used to produce\nan infinite lazy sequence."} boywhoroared.4clojure.p45-intro-to-iterate-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-45-test
 (testing
  "Problem 45: The iterate function can be used to produce\nan infinite lazy sequence."
  (is (= __ (take 5 (iterate (fn* [p1__187#] (+ 3 p1__187#)) 1))))))

