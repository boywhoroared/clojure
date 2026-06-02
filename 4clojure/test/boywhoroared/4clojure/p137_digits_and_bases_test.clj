(ns
 boywhoroared.4clojure.p137-digits-and-bases-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-137-test
 (testing
  "Problem 137: "
  (is (= [1 2 3 4 5 0 1] (__ 1234501 10)))
  (is (= [0] (__ 0 11)))
  (is (= [1 0 0 1] (__ 9 2)))
  (is (= [1 0] (let [n (rand-int 100000)] (__ n n))))
  (is
   (= [22 6 10 5 0 19 6 9 6 31] (__ js/Number.MAX_SAFE_INTEGER 42)))))

