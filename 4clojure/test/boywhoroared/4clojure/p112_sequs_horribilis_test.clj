(ns
  ^{:id 112 :difficulty "medium" :tags ["seqs"] :description "Create a function which takes
an integer and a nested collection of integers as arguments.
Analyze the elements of the input collection
and return a sequence which maintains the nested structure,
and which includes all elements starting from
the head whose sum is less than or equal to the input integer."} boywhoroared.4clojure.p112-sequs-horribilis-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-112-test
     (testing "Problem 112: Create a function which takes
an integer and a nested collection of integers as arguments.
Analyze the elements of the input collection
and return a sequence which maintains the nested structure,
and which includes all elements starting from
the head whose sum is less than or equal to the input integer."
       (is (=  (__ 10 [1 2 [3 [4 5] 6] 7])    '(1 2 (3 (4)))))
(is (=  (__ 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11])    '(1 2 (3 (4 (5 (6 (7))))))))
(is (=  (__ 9 (range))    '(0 1 2 3)))
(is (=  (__ 1 [[[[[1]]]]])    '(((((1)))))))
(is (=  (__ 0 [1 2 [3 [4 5] 6] 7])    '()))
(is (=  (__ 0 [0 0 [0 [0]]])    '(0 0 (0 (0)))))
(is (=  (__ 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]])
                        '(-10 (1 (2 3 (4))))))))