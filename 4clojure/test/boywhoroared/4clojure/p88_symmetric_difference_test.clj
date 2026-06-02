(ns
 ^{:difficulty "easy", :tags ["set-theory"], :description "Write a function which returns\nthe symmetric difference of two sets.\nThe symmetric difference is the set of items\nbelonging to one but not both of the two sets."} boywhoroared.4clojure.p88-symmetric-difference-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-88-test
 (testing
  "Problem 88: Write a function which returns\nthe symmetric difference of two sets.\nThe symmetric difference is the set of items\nbelonging to one but not both of the two sets."
  (is (= (__ #{1 4 6 3 2 5} #{7 1 3 5}) #{7 4 6 2}))
  (is (= (__ #{:c :b :a} #{}) #{:c :b :a}))
  (is (= (__ #{} #{4 6 5}) #{4 6 5}))
  (is (= (__ #{[2 3] [1 2]} #{[2 3] [3 4]}) #{[3 4] [1 2]}))))

