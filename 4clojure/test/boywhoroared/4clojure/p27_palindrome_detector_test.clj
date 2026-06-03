(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "Write a function which returns true\nif the given sequence is a palindrome.\n\nHint: \"racecar\" does not equal '(\\r \\a \\c \\e \\c \\a \\r)"} boywhoroared.4clojure.p27-palindrome-detector-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-27-test
 (testing
  "Problem 27: Write a function which returns true\nif the given sequence is a palindrome.\n\nHint: \"racecar\" does not equal '(\\r \\a \\c \\e \\c \\a \\r)"
  (is (false? (__ '(1 2 3 4 5))))
  (is (true? (__ "racecar")))
  (is (true? (__ [:foo :bar :foo])))
  (is (true? (__ '(1 1 3 3 1 1))))
  (is (false? (__ '(:a :b :c))))))

