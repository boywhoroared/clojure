(ns
 ^{:difficulty "easy", :tags ["strings"], :description "Write a function which takes a string\nand returns a new string containing only the capital letters."} boywhoroared.4clojure.p29-get-the-caps-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-29-test
 (testing
  "Problem 29: Write a function which takes a string\nand returns a new string containing only the capital letters."
  (is (= (__ "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (__ "nothing")))
  (is (= (__ "$#A(*&987Zf") "AZ"))))

