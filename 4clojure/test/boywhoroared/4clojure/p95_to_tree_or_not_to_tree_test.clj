(ns
  ^{:id 95 :difficulty "easy" :tags ["trees"] :description "Write a predicate which checks whether or not
a given sequence represents a binary tree.
Each node in the tree must have a value,
a left child, and a right child."} boywhoroared.4clojure.p95-to-tree-or-not-to-tree-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-95-test
     (testing "Problem 95: Write a predicate which checks whether or not
a given sequence represents a binary tree.
Each node in the tree must have a value,
a left child, and a right child."
       (is (= (__ '(:a (:b nil nil) nil))
   true))
(is (= (__ '(:a (:b nil nil)))
   false))
(is (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
   true))
(is (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false))
(is (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
   true))
(is (= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
   false))
(is (= (__ '(:a nil ()))
   false))))