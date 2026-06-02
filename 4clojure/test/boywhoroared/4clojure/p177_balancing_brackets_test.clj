(ns
 boywhoroared.4clojure.p177-balancing-brackets-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-177-test
 (testing
  "Problem 177: "
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

