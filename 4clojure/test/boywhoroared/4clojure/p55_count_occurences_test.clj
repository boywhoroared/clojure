(ns
 boywhoroared.4clojure.p55-count-occurences-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-55-test
 (testing
  "Problem 55: "
  (is (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
  (is (= (__ [:b :a :b :a :b]) {:a 2, :b 3}))
  (is (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))))

