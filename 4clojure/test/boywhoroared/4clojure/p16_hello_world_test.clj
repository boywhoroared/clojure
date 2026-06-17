(ns
  ^{:id 16 :difficulty "elementary" :tags [] :description "Write a function which returns a personalized greeting."} boywhoroared.4clojure.p16-hello-world-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-16-test
     (testing "Problem 16: Write a function which returns a personalized greeting."
       (is (= (__ "Dave") "Hello, Dave!"))
(is (= (__ "Jenn") "Hello, Jenn!"))
(is (= (__ "Rhea") "Hello, Rhea!"))))