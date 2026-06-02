(ns
 ^{:difficulty "medium", :tags ["higher-order-functions" "core-functions"], :description "Take a set of functions and return a new function\nthat takes a variable number of arguments and returns a sequence\ncontaining the result of applying each function\nleft-to-right to the argument list."} boywhoroared.4clojure.p59-juxtaposition-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-59-test
 (testing
  "Problem 59: Take a set of functions and return a new function\nthat takes a variable number of arguments and returns a sequence\ncontaining the result of applying each function\nleft-to-right to the argument list."
  (is (= [21 6 1] ((__ + max min) 2 3 5 1 6 4)))
  (is
   (=
    ["HELLO" 5]
    ((__ (fn* [p1__192#] (.toUpperCase p1__192#)) count) "hello")))
  (is (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8, :e 10})))))

