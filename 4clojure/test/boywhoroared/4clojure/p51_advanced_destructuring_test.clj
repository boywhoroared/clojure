(ns
  ^{:id 51 :difficulty "easy" :tags ["destructuring"] :description "Here is an example of some
more sophisticated destructuring."} boywhoroared.4clojure.p51-advanced-destructuring-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-51-test
     (testing "Problem 51: Here is an example of some
more sophisticated destructuring."
       (is (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d])))))