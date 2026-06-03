(ns
 ^{:difficulty "elementary", :tags [], :description "The -> macro threads an expression x through a variable number of forms.\nFirst, x is inserted as the second item in the first form,\nmaking a list of it if it is not a list already.\nThen the first form is inserted as the second item in the second form,\nmaking a list of that form if necessary.\nThis process continues for all the forms.\nUsing -> can sometimes make your code more readable."} boywhoroared.4clojure.p71-rearranging-code---test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-71-test
 (testing
  "Problem 71: The -> macro threads an expression x through a variable number of forms.\nFirst, x is inserted as the second item in the first form,\nmaking a list of it if it is not a list already.\nThen the first form is inserted as the second item in the second form,\nmaking a list of that form if necessary.\nThis process continues for all the forms.\nUsing -> can sometimes make your code more readable."
  (is
   (=
    (__ (sort (rest (reverse [2 5 4 1 3 6]))))
    (-> [2 5 4 1 3 6] reverse rest sort __)
    5))))

