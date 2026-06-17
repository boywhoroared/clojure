(ns
  ^{:id 126 :difficulty "easy" :tags ["fun" "brain-teaser"] :description "Enter a value which satisfies the following:"} boywhoroared.4clojure.p126-through-the-looking-class-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-126-test
     (testing "Problem 126: Enter a value which satisfies the following:"
       (is (let [x __]
                     (and (= (class x) x) x)))))