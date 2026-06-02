(ns
 boywhoroared.4clojure.p96-beauty-is-symmetry-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-96-test
  (testing
   "Problem 96: "
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

