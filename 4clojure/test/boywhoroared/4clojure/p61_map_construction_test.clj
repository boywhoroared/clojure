(ns
  ^{:id 61 :difficulty "easy" :tags ["core-functions"] :description "Write a function which takes a vector of keys
and a vector of values and constructs a map from them."} boywhoroared.4clojure.p61-map-construction-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-61-test
     (testing "Problem 61: Write a function which takes a vector of keys
and a vector of values and constructs a map from them."
       (is (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
(is (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
(is (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))))