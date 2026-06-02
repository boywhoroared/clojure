(ns
 boywhoroared.4clojure.p29-get-the-caps-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-29-test
 (testing
  "Problem 29: "
  (is (= (__ "HeLlO, WoRlD!") "HLOWRD"))
  (is (empty? (__ "nothing")))
  (is (= (__ "$#A(*&987Zf") "AZ"))))

