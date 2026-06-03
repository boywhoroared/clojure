(ns
 ^{:difficulty "elementary", :tags [], :description "When operating on a map,\nthe conj function returns a new map\nwith one or more key-value pairs \"added\"."} boywhoroared.4clojure.p11-conj-on-maps-test
 (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ [:b 2])
;; `conj` works on all collections. For `map`s it will assoc the new key-value pair

(deftest
 problem-11-test
 (testing
  "Problem 11: When operating on a map,\nthe conj function returns a new map\nwith one or more key-value pairs \"added\"."
  (is (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3])))))

(run-tests)
