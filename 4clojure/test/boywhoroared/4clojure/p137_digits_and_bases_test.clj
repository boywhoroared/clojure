(ns
 ^{:difficulty "medium", :tags ["math"], :description "Write a function which returns a sequence of digits\nof a non-negative number (first argument)\nin numerical system with an arbitrary base (second argument).\nDigits should be represented with their integer values,\ne.g. 15 would be [1 5] in base 10,\n[1 1 1 1] in base 2 and [15] in base 16."} boywhoroared.4clojure.p137-digits-and-bases-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-137-test
 (testing
  "Problem 137: Write a function which returns a sequence of digits\nof a non-negative number (first argument)\nin numerical system with an arbitrary base (second argument).\nDigits should be represented with their integer values,\ne.g. 15 would be [1 5] in base 10,\n[1 1 1 1] in base 2 and [15] in base 16."
  (is (= [1 2 3 4 5 0 1] (__ 1234501 10)))
  (is (= [0] (__ 0 11)))
  (is (= [1 0 0 1] (__ 9 2)))
  (is (= [1 0] (let [n (rand-int 100000)] (__ n n))))
  (is
   (= [22 6 10 5 0 19 6 9 6 31] (__ js/Number.MAX_SAFE_INTEGER 42)))))

