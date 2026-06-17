(ns
  ^{:id 45 :difficulty "easy" :tags ["seqs"] :description "The iterate function can be used to produce
an infinite lazy sequence."} boywhoroared.4clojure.p45-intro-to-iterate-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-45-test
     (testing "Problem 45: The iterate function can be used to produce
an infinite lazy sequence."
       (is (= __ (take 5 (iterate #(+ 3 %) 1))))))