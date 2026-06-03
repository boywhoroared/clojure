(ns
 ^{:difficulty "easy", :tags ["trees"], :description "Let us define a binary tree as \"symmetric\"\nif the left half of the tree is\nthe mirror image of the right half of the tree.\nWrite a predicate to determine whether or not\na given binary tree is symmetric.\n(see To Tree, or not to Tree for a reminder on\nthe tree representation we're using)."} boywhoroared.4clojure.p96-beauty-is-symmetry-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-96-test
 (testing
  "Problem 96: Let us define a binary tree as \"symmetric\"\nif the left half of the tree is\nthe mirror image of the right half of the tree.\nWrite a predicate to determine whether or not\na given binary tree is symmetric.\n(see To Tree, or not to Tree for a reminder on\nthe tree representation we're using)."
  (is (= (__ '(:a (:b nil nil) (:b nil nil))) true))
  (is (= (__ '(:a (:b nil nil) nil)) false))
  (is (= (__ '(:a (:b nil nil) (:c nil nil))) false))
  (is
   (=
    (__
     [1
      [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
      [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
    true))
  (is
   (=
    (__
     [1
      [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
      [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
    false))
  (is
   (=
    (__
     [1
      [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
      [2 [3 nil [4 [6 nil nil] nil]] nil]])
    false))))

