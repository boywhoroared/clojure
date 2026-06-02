(ns
 boywhoroared.4clojure.p95-to-tree-or-not-to-tree-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-95-test
 (testing
  "Problem 95: "
  (is (= (__ '(:a (:b nil nil) nil)) true))
  (is (= (__ '(:a (:b nil nil))) false))
  (is (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]]) true))
  (is (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false))
  (is (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil]) true))
  (is (= (__ [1 [2 [3 [4 false nil] nil] nil] nil]) false))
  (is (= (__ '(:a nil ())) false))))

