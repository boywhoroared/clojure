(ns
  ^{:id 162 :difficulty "elementary" :tags ["logic"] :description "In Clojure, only nil and false represent the values of logical
falsity in conditional tests - anything else is logical truth."} boywhoroared.4clojure.p162-logical-falsity-and-truth-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-162-test
     (testing "Problem 162: In Clojure, only nil and false represent the values of logical
falsity in conditional tests - anything else is logical truth."
       (is (= __ (if-not false 1 0)))
(is (= __ (if-not nil 1 0)))
(is (= __ (if true 1 0)))
(is (= __ (if [] 1 0)))
(is (= __ (if [0] 1 0)))
(is (= __ (if 0 1 0)))
(is (= __ (if 1 1 0)))))