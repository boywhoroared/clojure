(ns
 boywhoroared.4clojure.p65-black-box-testing-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-65-test
 (testing
  "Problem 65: "
  (is (= :map (__ {:a 1, :b 2})))
  (is (= :list (__ (range (rand-int 20)))))
  (is (= :vector (__ [1 2 3 4 5 6])))
  (is (= :set (__ #{10 (rand-int 5)})))
  (is (= [:map :set :vector :list] (map __ [{} #{} [] ()])))))

