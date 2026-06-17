(ns
  ^{:id 101 :difficulty "hard" :tags ["seqs"] :description "Given two sequences x and y,
calculate the Levenshtein distance of x and y,
i. e. the minimum number of edits needed to transform x into y.
The allowed edits are:

- insert a single item
- delete a single item
- replace a single item with another item

WARNING: Some of the test cases may timeout
if you write an inefficient solution!"} boywhoroared.4clojure.p101-levenshtein-distance-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-101-test
     (testing "Problem 101: Given two sequences x and y,
calculate the Levenshtein distance of x and y,
i. e. the minimum number of edits needed to transform x into y.
The allowed edits are:

- insert a single item
- delete a single item
- replace a single item with another item

WARNING: Some of the test cases may timeout
if you write an inefficient solution!"
       (is (= (__ "kitten" "sitting") 3))
(is (= (__ "closure" "clojure") (__ "clojure" "closure") 1))
(is (= (__ "xyx" "xyyyx") 2))
(is (= (__ "" "123456") 6))
(is (= (__ "Clojure" "Clojure") (__ "" "") (__ [] []) 0))
(is (= (__ [1 2 3 4] [0 2 3 4 5]) 2))
(is (= (__ '(:a :b :c :d) '(:a :d)) 2))
(is (= (__ "ttttattttctg" "tcaaccctaccat") 10))
(is (= (__ "gaattctaatctc" "caaacaaaaaattt") 9))))