(ns
 boywhoroared.4clojure.p102-intocamelcase-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-102-test
 (testing
  "Problem 102: "
  (is (= (__ "something") "something"))
  (is (= (__ "multi-word-key") "multiWordKey"))
  (is (= (__ "leaveMeAlone") "leaveMeAlone"))))

