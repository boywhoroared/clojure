(ns
 boywhoroared.4clojure.p6-vectors-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-6-test
  (testing
   "Problem 6: "
    (is (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))

