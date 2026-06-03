(ns
 ^{:difficulty "elementary", :tags [], :description "The ->> macro threads an expression x\nthrough a variable number of forms.\nFirst, x is inserted as the last item in the first form,\nmaking a list of it if it is not a list already.\nThen the first form is inserted as the last item in the second form,\nmaking a list of that form if necessary.\nThis process continues for all the forms.\nUsing ->> can sometimes make your code more readable."} boywhoroared.4clojure.p72-rearranging-code---test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-72-test
 (testing
  "Problem 72: The ->> macro threads an expression x\nthrough a variable number of forms.\nFirst, x is inserted as the last item in the first form,\nmaking a list of it if it is not a list already.\nThen the first form is inserted as the last item in the second form,\nmaking a list of that form if necessary.\nThis process continues for all the forms.\nUsing ->> can sometimes make your code more readable."
  (is
   (=
    (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
    (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
    11))))

