(ns
  ^{:id 122 :difficulty "easy" :tags [] :description "Convert a binary number,
provided in the form of a string,
to its numerical value."} boywhoroared.4clojure.p122-read-a-binary-number-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-122-test
     (testing "Problem 122: Convert a binary number,
provided in the form of a string,
to its numerical value."
       (is (= 0     (__ "0")))
(is (= 7     (__ "111")))
(is (= 8     (__ "1000")))
(is (= 9     (__ "1001")))
(is (= 255   (__ "11111111")))
(is (= 1365  (__ "10101010101")))
(is (= 65535 (__ "1111111111111111")))))