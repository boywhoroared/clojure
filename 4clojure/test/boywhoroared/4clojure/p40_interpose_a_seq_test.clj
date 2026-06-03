(ns
 ^{:difficulty "easy", :tags ["seqs" "core-functions"], :description "Write a function which separates\nthe items of a sequence by an arbitrary value."} boywhoroared.4clojure.p40-interpose-a-seq-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-40-test
 (testing
  "Problem 40: Write a function which separates\nthe items of a sequence by an arbitrary value."
  (is (= (__ 0 [1 2 3]) [1 0 2 0 3]))
  (is
   (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three"))
  (is (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))))

