(ns boywhoroared.4clojure.p4-lists-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-4-test
  ; (testing "Problem 4: " (is (= (list __) '(:a :b :c)))))
  (testing "Problem 4: " (is (= (list :a :b :c) '(:a :b :c)))))

(run-tests)

