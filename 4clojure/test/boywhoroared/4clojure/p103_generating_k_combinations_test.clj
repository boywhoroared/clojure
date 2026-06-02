(ns
 boywhoroared.4clojure.p103-generating-k-combinations-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-103-test
 (testing
  "Problem 103: "
  (is (= (__ 1 #{4 6 5}) #{#{6} #{5} #{4}}))
  (is (= (__ 10 #{4 6 5}) #{}))
  (is (= (__ 2 #{0 1 2}) #{#{0 1} #{1 2} #{0 2}}))
  (is
   (=
    (__ 3 #{0 1 4 3 2})
    #{#{0 4 3}
      #{0 1 4}
      #{4 3 2}
      #{0 1 2}
      #{0 1 3}
      #{1 3 2}
      #{0 3 2}
      #{1 4 3}
      #{1 4 2}
      #{0 4 2}}))
  (is
   (= (__ 4 #{"efg" "abc" [1 2 3] :a}) #{#{"efg" "abc" [1 2 3] :a}}))
  (is
   (=
    (__ 2 #{"efg" "abc" [1 2 3] :a})
    #{#{[1 2 3] :a}
      #{"efg" :a}
      #{"abc" :a}
      #{"abc" [1 2 3]}
      #{"efg" "abc"}
      #{"efg" [1 2 3]}}))))

