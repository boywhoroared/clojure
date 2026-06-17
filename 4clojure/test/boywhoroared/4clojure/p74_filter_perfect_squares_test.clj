(ns
  ^{:id 74 :difficulty "medium" :tags [] :description "Given a string of comma separated integers,
write a function which returns a new comma separated string
that only contains the numbers which are perfect squares."} boywhoroared.4clojure.p74-filter-perfect-squares-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-74-test
     (testing "Problem 74: Given a string of comma separated integers,
write a function which returns a new comma separated string
that only contains the numbers which are perfect squares."
       (is (= (__ "4,5,6,7,8,9") "4,9"))
(is (= (__ "15,16,25,36,37") "16,25,36"))))