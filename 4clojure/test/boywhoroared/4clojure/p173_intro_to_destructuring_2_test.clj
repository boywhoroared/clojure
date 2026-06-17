(ns
  ^{:id 173 :difficulty "easy" :tags ["destructuring"] :description "Sequential destructuring allows you to bind symbols to parts of
sequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete
the bindings so all let-parts evaluate to 3."} boywhoroared.4clojure.p173-intro-to-destructuring-2-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-173-test
     (testing "Problem 173: Sequential destructuring allows you to bind symbols to parts of
sequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete
the bindings so all let-parts evaluate to 3."
       (is (= 3
                      (let [[__] [+ (range 3)]] (apply __))
                      (let [[[__] b] [[+ 1] 2]] (__ b))
                      (let [[__] [inc 2]] (__))))))