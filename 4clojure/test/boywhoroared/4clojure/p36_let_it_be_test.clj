(ns
  ^{:id 36 :difficulty "elementary" :tags ["math" "syntax"] :description "Can you bind x, y, and z so that these are all true?"} boywhoroared.4clojure.p36-let-it-be-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-36-test
     (testing "Problem 36: Can you bind x, y, and z so that these are all true?"
       (is (= 10 (let __ (+ x y))))
(is (= 4 (let __ (+ y z))))
(is (= 1 (let __ z)))))