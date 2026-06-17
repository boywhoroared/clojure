(ns
  ^{:id 37 :difficulty "elementary" :tags ["regex" "syntax"] :description "Regex patterns are supported with a special reader macro."} boywhoroared.4clojure.p37-regular-expressions-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-37-test
     (testing "Problem 37: Regex patterns are supported with a special reader macro."
       (is (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))))