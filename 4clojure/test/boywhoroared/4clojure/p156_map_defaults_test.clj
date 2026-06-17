(ns
  ^{:id 156 :difficulty "elementary" :tags ["seqs"] :description "When retrieving values from a map, you can specify default
values in case the key is not found:

(= 2 (:foo {:bar 0, :baz 1} 2))

However, what if you want the map itself to contain the default values? Write a
function which takes a default value and a sequence of keys and constructs a map."} boywhoroared.4clojure.p156-map-defaults-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-156-test
     (testing "Problem 156: When retrieving values from a map, you can specify default
values in case the key is not found:

(= 2 (:foo {:bar 0, :baz 1} 2))

However, what if you want the map itself to contain the default values? Write a
function which takes a default value and a sequence of keys and constructs a map."
       (is (= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0}))
(is (= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}))
(is (= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]}))))