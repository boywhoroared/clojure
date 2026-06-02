(ns
 ^{:difficulty "easy", :tags [], :description "Write a function which takes\na variable number of booleans.\nYour function should return true if\nsome of the parameters are true,\nbut not all of the parameters are true.\nOtherwise your function should return false."} boywhoroared.4clojure.p83-a-half-truth-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-83-test
 (testing
  "Problem 83: Write a function which takes\na variable number of booleans.\nYour function should return true if\nsome of the parameters are true,\nbut not all of the parameters are true.\nOtherwise your function should return false."
  (is (= false (__ false false)))
  (is (= true (__ true false)))
  (is (= false (__ true)))
  (is (= true (__ false true false)))
  (is (= false (__ true true true)))
  (is (= true (__ true true true false)))))

