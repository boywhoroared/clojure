(ns boywhoroared.4clojure.p3-strings-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ "HELLO WORLD")

(deftest
  problem-3-test
  (testing "Problem 3: " (is (= __ (.toUpperCase "hello world")))))

(run-tests)

