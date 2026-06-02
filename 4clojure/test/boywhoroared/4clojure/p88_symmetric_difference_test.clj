(ns
 boywhoroared.4clojure.p88-symmetric-difference-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-88-test
  (testing
   "Problem 88: "
    (is (= (__ #{1 4 6 3 2 5} #{7 1 3 5}) #{7 4 6 2}))
    (is (= (__ #{:c :b :a} #{}) #{:c :b :a}))
    (is (= (__ #{} #{4 6 5}) #{4 6 5}))
    (is (= (__ #{[2 3] [1 2]} #{[2 3] [3 4]}) #{[3 4] [1 2]}))))

