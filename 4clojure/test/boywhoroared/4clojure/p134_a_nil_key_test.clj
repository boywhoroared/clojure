(ns
 ^{:difficulty "elementary", :tags ["maps"], :description "Write a function which, given a key and map, returns true iff\nthe map contains an entry with that key and its value is nil."} boywhoroared.4clojure.p134-a-nil-key-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-134-test
 (testing
  "Problem 134: Write a function which, given a key and map, returns true iff\nthe map contains an entry with that key and its value is nil."
  (is (true? (__ :a {:a nil, :b 2})))
  (is (false? (__ :b {:a nil, :b 2})))
  (is (false? (__ :c {:a nil, :b 2})))))

