(ns
 ^{:difficulty "medium", :tags ["seqs" "core-functions"], :description "Write a function which\nremoves the duplicates from a sequence.\nOrder of the items must be maintained."} boywhoroared.4clojure.p56-find-distinct-items-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-56-test
 (testing
  "Problem 56: Write a function which\nremoves the duplicates from a sequence.\nOrder of the items must be maintained."
  (is (= (__ [1 2 1 3 1 2 4]) [1 2 3 4]))
  (is (= (__ [:a :a :b :b :c :c]) [:a :b :c]))
  (is (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
  (is (= (__ (range 50)) (range 50)))))

