(ns
 ^{:difficulty "medium", :tags ["parsing"], :description "When parsing a snippet of code it's often a good idea to do a\nsanity check to see if all the brackets match up. Write a function that takes in\na string and returns truthy if all square [ ] round ( ) and curly { } brackets are\nproperly paired and legally nested, or returns falsey otherwise."} boywhoroared.4clojure.p177-balancing-brackets-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-177-test
 (testing
  "Problem 177: When parsing a snippet of code it's often a good idea to do a\nsanity check to see if all the brackets match up. Write a function that takes in\na string and returns truthy if all square [ ] round ( ) and curly { } brackets are\nproperly paired and legally nested, or returns falsey otherwise."
  (is (__ "This string has no brackets."))
  (is
   (__
    "class Test {\n                          public static void main(String[] args) {\n                            System.out.println(\"Hello world.\");\n                          }\n                        }"))
  (is (not (__ "(start, end]")))
  (is (not (__ "())")))
  (is (not (__ "[ { ] } ")))
  (is (__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))"))
  (is
   (not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))")))
  (is (not (__ "[")))))

