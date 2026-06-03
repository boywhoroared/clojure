(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "Write a function which\ndrops every Nth item from a sequence."} boywhoroared.4clojure.p41-drop-every-nth-item-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-41-test
 (testing
  "Problem 41: Write a function which\ndrops every Nth item from a sequence."
  (is (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
  (is (= (__ [:a :b :c :d :e :f] 2) [:a :c :e]))
  (is (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6]))))

