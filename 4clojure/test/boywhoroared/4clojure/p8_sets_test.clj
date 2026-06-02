(ns
 boywhoroared.4clojure.p8-sets-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-8-test
 (testing
  "Problem 8: "
  (is (= __ (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= __ (clojure.set/union #{:c :b :a} #{:c :b :d})))))

