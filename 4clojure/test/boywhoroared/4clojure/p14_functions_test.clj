(ns
 ^{:difficulty "elementary", :tags [], :description "Clojure has many different ways to create functions."} boywhoroared.4clojure.p14-functions-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-14-test
 (testing
  "Problem 14: Clojure has many different ways to create functions."
  (is (= __ ((fn add-five [x] (+ x 5)) 3)))
  (is (= __ ((fn [x] (+ x 5)) 3)))
  (is (= __ ((fn* [p1__184#] (+ p1__184# 5)) 3)))
  (is (= __ ((partial + 5) 3)))))

