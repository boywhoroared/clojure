(ns
 ^{:difficulty "medium", :tags ["higher-order-functions"], :description "Write a higher-order function which\nflips the order of the arguments of an input function."} boywhoroared.4clojure.p46-flipping-out-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-46-test
 (testing
  "Problem 46: Write a higher-order function which\nflips the order of the arguments of an input function."
  (is (= 3 ((__ nth) 2 [1 2 3 4 5])))
  (is (= true ((__ >) 7 8)))
  (is (= 4 ((__ quot) 2 8)))
  (is (= [1 2 3] ((__ take) [1 2 3 4 5] 3)))))

