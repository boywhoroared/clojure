(ns
  ^{:id 118 :difficulty "easy" :tags ["core-seqs"] :description "Map is one of the core elements
of a functional programming language.
Given a function f and an input sequence s,
return a lazy sequence of (f x) for each element x in s."} boywhoroared.4clojure.p118-re-implement-map-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-118-test
     (testing "Problem 118: Map is one of the core elements
of a functional programming language.
Given a function f and an input sequence s,
return a lazy sequence of (f x) for each element x in s."
       (is (= [3 4 5 6 7]
                       (__ inc [2 3 4 5 6])))
(is (= (repeat 10 nil)
                       (__ (fn [_] nil) (range 10))))
(is (= [1000000 1000001]
                       (->> (__ inc (range))
                            (drop (dec 1000000))
                            (take 2))))
(is (= [1000000 1000001]
                       (->> (__ inc (range))
                            (drop (dec 1000000))
                            (take 2))))))