(ns
 ^{:difficulty "easy", :tags [], :description "The contains? function checks if a KEY\nis present in a given collection.\nThis often leads beginner clojurians to use it incorrectly\nwith numerically indexed collections like vectors and lists."} boywhoroared.4clojure.p47-contain-yourself-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-47-test
 (testing
  "Problem 47: The contains? function checks if a KEY\nis present in a given collection.\nThis often leads beginner clojurians to use it incorrectly\nwith numerically indexed collections like vectors and lists."
  (is (contains? #{4 6 5} __))
  (is (contains? [1 1 1 1 1] __))
  (is (contains? {4 :a, 2 :b} __))
  (is (not (contains? [1 2 4] __)))))

