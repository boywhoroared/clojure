(ns
  ^{:id 59 :difficulty "medium" :tags ["higher-order-functions" "core-functions"] :description "Take a set of functions and return a new function
that takes a variable number of arguments and returns a sequence
containing the result of applying each function
left-to-right to the argument list."} boywhoroared.4clojure.p59-juxtaposition-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-59-test
     (testing "Problem 59: Take a set of functions and return a new function
that takes a variable number of arguments and returns a sequence
containing the result of applying each function
left-to-right to the argument list."
       (is (= [21 6 1] ((__ + max min) 2 3 5 1 6 4)))
(is (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello")))
(is (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10})))))