(ns
 ^{:difficulty "elementary", :tags [], :description "Clojure strings are Java strings,
so you can use Java string methods on them."} boywhoroared.4clojure.p3-strings-test
  (:require [clojure.test :refer [deftest is testing]]))

(def __ "HELLO WORLD")

(deftest
  problem-3-test
  (testing
   "Problem 3: Clojure strings are Java strings,
so you can use Java string methods on them."
    (is (= __ (.toUpperCase "hello world")))))

