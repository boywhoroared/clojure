(ns
 boywhoroared.4clojure.p122-read-a-binary-number-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-122-test
 (testing
  "Problem 122: "
  (is (= 0 (__ "0")))
  (is (= 7 (__ "111")))
  (is (= 8 (__ "1000")))
  (is (= 9 (__ "1001")))
  (is (= 255 (__ "11111111")))
  (is (= 1365 (__ "10101010101")))
  (is (= 65535 (__ "1111111111111111")))))

