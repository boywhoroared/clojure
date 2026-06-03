(ns
 ^{:difficulty "easy", :tags ["destructuring"], :description "Sequential destructuring allows you to bind symbols to parts of\nsequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete\nthe bindings so all let-parts evaluate to 3."} boywhoroared.4clojure.p173-intro-to-destructuring-2-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-173-test
 (testing
  "Problem 173: Sequential destructuring allows you to bind symbols to parts of\nsequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete\nthe bindings so all let-parts evaluate to 3."
  (is
   (=
    3
    (let [[__] [+ (range 3)]] (apply __))
    (let [[[__] b] [[+ 1] 2]] (__ b))
    (let [[__] [inc 2]] (__))))))

