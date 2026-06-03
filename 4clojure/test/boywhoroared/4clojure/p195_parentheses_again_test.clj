(ns
 ^{:difficulty "medium", :tags ["math" "combinatorics"], :description "In a family of languages like Lisp, having balanced parentheses\nis a defining feature of the language. Luckily, Lisp has almost no syntax, except\nfor these \"delimiters\" -- and that hardly qualifies as \"syntax\", at least in any\nuseful computer programming sense.\n\nIt is not a difficult exercise to find all the combinations of well-formed parentheses\nif we only have N pairs to work with. For instance, if we only have 2 pairs, we only\nhave two possible combinations: \"()()\" and \"(())\". Any other combination of length 4\nis ill-formed. Can you see why?\n\nGenerate all possible combinations of well-formed parentheses of length 2n (n pairs\nof parentheses). For this problem, we only consider '(' and ')', but the answer\nis similar if you work with only {} or only [].\n\nThere is an interesting pattern in the numbers!"} boywhoroared.4clojure.p195-parentheses-again-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-195-test
 (testing
  "Problem 195: In a family of languages like Lisp, having balanced parentheses\nis a defining feature of the language. Luckily, Lisp has almost no syntax, except\nfor these \"delimiters\" -- and that hardly qualifies as \"syntax\", at least in any\nuseful computer programming sense.\n\nIt is not a difficult exercise to find all the combinations of well-formed parentheses\nif we only have N pairs to work with. For instance, if we only have 2 pairs, we only\nhave two possible combinations: \"()()\" and \"(())\". Any other combination of length 4\nis ill-formed. Can you see why?\n\nGenerate all possible combinations of well-formed parentheses of length 2n (n pairs\nof parentheses). For this problem, we only consider '(' and ')', but the answer\nis similar if you work with only {} or only [].\n\nThere is an interesting pattern in the numbers!"
  (is
   (= [#{""} #{"()"} #{"(())" "()()"}] (map (fn [n] (__ n)) [0 1 2])))
  (is (= #{"(()())" "((()))" "()()()" "()(())" "(())()"} (__ 3)))
  (is (= 16796 (count (__ 10))))
  (is
   (=
    (nth
     (sort
      (filter
       (fn*
        [p1__230#]
        (clojure.string/includes? p1__230# "(()()()())"))
       (__ 9)))
     6)
    "(((()()()())(())))"))
  (is (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))"))))

