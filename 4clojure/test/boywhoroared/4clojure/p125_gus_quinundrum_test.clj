(ns
  ^{:id 125 :difficulty "hard" :tags ["logic" "fun" "brain-teaser"] :description "Create a function of no arguments
which returns a string that is
an exact copy of the function itself.

Hint: Read up on quines if you get stuck
(this question is harder than it first appears);
but it’s worth the effort to solve it independently if you can!

Fun fact: Gus is the name of the 4Clojure dragon."} boywhoroared.4clojure.p125-gus-quinundrum-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-125-test
     (testing "Problem 125: Create a function of no arguments
which returns a string that is
an exact copy of the function itself.

Hint: Read up on quines if you get stuck
(this question is harder than it first appears);
but it’s worth the effort to solve it independently if you can!

Fun fact: Gus is the name of the 4Clojure dragon."
       (is (= (str '__) (__)))))