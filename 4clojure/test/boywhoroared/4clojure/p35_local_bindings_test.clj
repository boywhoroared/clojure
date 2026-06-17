(ns
  ^{:id 35 :difficulty "elementary" :tags ["syntax"] :description "Clojure lets you give local names
to values using the special let-form."} boywhoroared.4clojure.p35-local-bindings-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-35-test
     (testing "Problem 35: Clojure lets you give local names
to values using the special let-form."
       (is (= __ (let [x 5] (+ 2 x))))
(is (= __ (let [x 3, y 10] (- y x))))
(is (= __ (let [x 21] (let [y 3] (/ x y)))))))