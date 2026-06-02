(ns
 ^{:difficulty "elementary", :tags ["seqs"], :description "When retrieving values from a map, you can specify default\nvalues in case the key is not found:\n\n(= 2 (:foo {:bar 0, :baz 1} 2))\n\nHowever, what if you want the map itself to contain the default values? Write a\nfunction which takes a default value and a sequence of keys and constructs a map."} boywhoroared.4clojure.p156-map-defaults-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-156-test
 (testing
  "Problem 156: When retrieving values from a map, you can specify default\nvalues in case the key is not found:\n\n(= 2 (:foo {:bar 0, :baz 1} 2))\n\nHowever, what if you want the map itself to contain the default values? Write a\nfunction which takes a default value and a sequence of keys and constructs a map."
  (is (= (__ 0 [:a :b :c]) {:a 0, :b 0, :c 0}))
  (is (= (__ "x" [1 2 3]) {1 "x", 2 "x", 3 "x"}))
  (is (= (__ [:a :b] [:foo :bar]) {:foo [:a :b], :bar [:a :b]}))))

