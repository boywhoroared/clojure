(ns
  ^{:id 177 :difficulty "medium" :tags ["parsing"] :description "When parsing a snippet of code it's often a good idea to do a
sanity check to see if all the brackets match up. Write a function that takes in
a string and returns truthy if all square [ ] round ( ) and curly { } brackets are
properly paired and legally nested, or returns falsey otherwise."} boywhoroared.4clojure.p177-balancing-brackets-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-177-test
     (testing "Problem 177: When parsing a snippet of code it's often a good idea to do a
sanity check to see if all the brackets match up. Write a function that takes in
a string and returns truthy if all square [ ] round ( ) and curly { } brackets are
properly paired and legally nested, or returns falsey otherwise."
       (is (__ "This string has no brackets."))
(is (__ "class Test {
                          public static void main(String[] args) {
                            System.out.println(\"Hello world.\");
                          }
                        }"))
(is (not (__ "(start, end]")))
(is (not (__ "())")))
(is (not (__ "[ { ] } ")))
(is (__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))"))
(is (not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))")))
(is (not (__ "[")))))