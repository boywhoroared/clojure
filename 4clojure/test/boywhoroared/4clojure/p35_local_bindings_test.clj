(ns
 ^{:difficulty "elementary", :tags ["syntax"], :description "Clojure lets you give local names\nto values using the special let-form."} boywhoroared.4clojure.p35-local-bindings-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-35-test
 (testing
  "Problem 35: Clojure lets you give local names\nto values using the special let-form."
  (is (= __ (let [x 5] (+ 2 x))))
  (is (= __ (let [x 3 y 10] (- y x))))
  (is (= __ (let [x 21] (let [y 3] (/ x y)))))))

