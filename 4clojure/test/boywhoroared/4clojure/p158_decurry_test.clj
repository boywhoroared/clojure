(ns
  ^{:id 158 :difficulty "medium" :tags ["partial-functions"] :description "Write a function that accepts a curried function of unknown arity n.
Return an equivalent function of n arguments. "} boywhoroared.4clojure.p158-decurry-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-158-test
     (testing "Problem 158: Write a function that accepts a curried function of unknown arity n.
Return an equivalent function of n arguments. "
       (is (= 10 ((__ (fn [a]
                                (fn [b]
                                  (fn [c]
                                    (fn [d]
                                      (+ a b c d))))))
                          1 2 3 4)))
(is (= 24 ((__ (fn [a]
                                (fn [b]
                                  (fn [c]
                                    (fn [d]
                                      (* a b c d))))))
                          1 2 3 4)))
(is (= 25 ((__ (fn [a]
                                (fn [b]
                                  (* a b))))
                          5 5)))))