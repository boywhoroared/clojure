(ns
 ^{:difficulty "elementary", :tags [], :description "Sets are collections of unique values."} boywhoroared.4clojure.p8-sets-test
  (:require [clojure.test :refer [deftest is testing run-tests]]
            [clojure.set]))

(def __ #{:a :b :c :d})
;; elements in a set are unique and not duplicated

(deftest
  problem-8-test
  (testing
   "Problem 8: Sets are collections of unique values."
    (is (= __ (set '(:a :a :b :c :c :c :c :d :d))))
    (is (= __ (clojure.set/union #{:c :b :a} #{:c :b :d})))))

(run-tests)
