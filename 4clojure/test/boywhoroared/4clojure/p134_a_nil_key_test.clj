(ns
  ^{:id 134 :difficulty "elementary" :tags ["maps"] :description "Write a function which, given a key and map, returns true iff
the map contains an entry with that key and its value is nil."} boywhoroared.4clojure.p134-a-nil-key-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-134-test
     (testing "Problem 134: Write a function which, given a key and map, returns true iff
the map contains an entry with that key and its value is nil."
       (is (true?  (__ :a {:a nil :b 2})))
(is (false? (__ :b {:a nil :b 2})))
(is (false? (__ :c {:a nil :b 2})))))