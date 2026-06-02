(ns
 ^{:difficulty "medium", :tags ["seqs" "sorting"], :description "Given any number of sequences,\neach sorted from smallest to largest,\nfind the smallest single number\nwhich appears in all of the sequences.\nThe sequences may be infinite, so be careful to search lazily."} boywhoroared.4clojure.p108-lazy-searching-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-108-test
 (testing
  "Problem 108: Given any number of sequences,\neach sorted from smallest to largest,\nfind the smallest single number\nwhich appears in all of the sequences.\nThe sequences may be infinite, so be careful to search lazily."
  (is (= 3 (__ [3 4 5])))
  (is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
  (is
   (=
    64
    (__
     (map (fn* [p1__200#] (* p1__200# p1__200# p1__200#)) (range))
     (filter
      (fn* [p1__201#] (zero? (bit-and p1__201# (dec p1__201#))))
      (range))
     (iterate inc 20))))
  (is (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])))))

