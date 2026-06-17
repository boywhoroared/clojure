(ns
  ^{:id 120 :difficulty "easy" :tags ["math"] :description "Write a function which takes
a collection of integers as an argument.
Return the count of how many elements are smaller than
the sum of their squared component digits.
For example: 10 is larger than 1 squared plus 0 squared;
whereas 15 is smaller than 1 squared plus 5 squared."} boywhoroared.4clojure.p120-sum-of-square-of-digits-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-120-test
     (testing "Problem 120: Write a function which takes
a collection of integers as an argument.
Return the count of how many elements are smaller than
the sum of their squared component digits.
For example: 10 is larger than 1 squared plus 0 squared;
whereas 15 is smaller than 1 squared plus 5 squared."
       (is (= 8 (__ (range 10))))
(is (= 19 (__ (range 30))))
(is (= 50 (__ (range 100))))
(is (= 50 (__ (range 1000))))))