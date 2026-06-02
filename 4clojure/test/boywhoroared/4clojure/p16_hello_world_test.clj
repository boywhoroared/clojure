(ns
 ^{:difficulty "elementary", :tags [], :description "Write a function which returns a personalized greeting."} boywhoroared.4clojure.p16-hello-world-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-16-test
 (testing
  "Problem 16: Write a function which returns a personalized greeting."
  (is (= (__ "Dave") "Hello, Dave!"))
  (is (= (__ "Jenn") "Hello, Jenn!"))
  (is (= (__ "Rhea") "Hello, Rhea!"))))

