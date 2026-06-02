(ns
 boywhoroared.4clojure.p118-re-implement-map-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-118-test
 (testing
  "Problem 118: "
  (is (= [3 4 5 6 7] (__ inc [2 3 4 5 6])))
  (is (= (repeat 10 nil) (__ (fn [_] nil) (range 10))))
  (is
   (=
    [1000000 1000001]
    (->> (__ inc (range)) (drop (dec 1000000)) (take 2))))
  (is
   (=
    [1000000 1000001]
    (->> (__ inc (range)) (drop (dec 1000000)) (take 2))))))

