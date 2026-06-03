(ns
 ^{:difficulty "elementary", :tags [], :description "Lists can be constructed with either\na function or a quoted form."} boywhoroared.4clojure.p4-lists-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-4-test
 (testing
  "Problem 4: Lists can be constructed with either\na function or a quoted form."
  (is (= (list __) '(:a :b :c)))))

