(ns
 ^{:difficulty "hard", :tags ["logic" "fun" "brain-teaser"], :description "Create a function of no arguments\nwhich returns a string that is\nan exact copy of the function itself.\n\nHint: Read up on quines if you get stuck\n(this question is harder than it first appears);\nbut it’s worth the effort to solve it independently if you can!\n\nFun fact: Gus is the name of the 4Clojure dragon."} boywhoroared.4clojure.p125-gus-quinundrum-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-125-test
 (testing
  "Problem 125: Create a function of no arguments\nwhich returns a string that is\nan exact copy of the function itself.\n\nHint: Read up on quines if you get stuck\n(this question is harder than it first appears);\nbut it’s worth the effort to solve it independently if you can!\n\nFun fact: Gus is the name of the 4Clojure dragon."
  (is (= (str '__) (__)))))

