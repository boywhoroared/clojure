(ns
 ^{:difficulty "medium", :tags ["seqs" "math"], :description "A palindromic number is a number that is the same when\nwritten forwards or backwards (e.g., 3, 99, 14341).\n\nWrite a function which takes an integer n, as its only argument, and\nreturns an increasing lazy sequence of all palindromic numbers that\nare not less than n.\n\nThe most simple solution will exceed the time limit!"} boywhoroared.4clojure.p150-palindromic-numbers-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-150-test
 (testing
  "Problem 150: A palindromic number is a number that is the same when\nwritten forwards or backwards (e.g., 3, 99, 14341).\n\nWrite a function which takes an integer n, as its only argument, and\nreturns an increasing lazy sequence of all palindromic numbers that\nare not less than n.\n\nThe most simple solution will exceed the time limit!"
  (is
   (=
    (take 26 (__ 0))
    [0
     1
     2
     3
     4
     5
     6
     7
     8
     9
     11
     22
     33
     44
     55
     66
     77
     88
     99
     101
     111
     121
     131
     141
     151
     161]))
  (is
   (=
    (take 16 (__ 162))
    [171 181 191 202 212 222 232 242 252 262 272 282 292 303 313 323]))
  (is
   (=
    (take 6 (__ 1234550000))
    [1234554321
     1234664321
     1234774321
     1234884321
     1234994321
     1235005321]))
  (is (= (first (__ (* 111111111 111111111))) (* 111111111 111111111)))
  (is
   (=
    (set (take 199 (__ 0)))
    (set
     (map (fn* [p1__209#] (first (__ p1__209#))) (range 0 10000)))))
  (is (= true (apply < (take 6666 (__ 9999999)))))
  (is (= (nth (__ 0) 10101) 9102019))))

