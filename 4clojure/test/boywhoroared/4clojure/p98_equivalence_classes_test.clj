(ns
 ^{:difficulty "medium", :tags [], :description "A function f defined on a domain D\ninduces an equivalence relation on D, as follows:\na is equivalent to b with respect to f\nif and only if (f a) is equal to (f b).\nWrite a function with arguments f and D\nthat computes the equivalence classes of D with respect to f."} boywhoroared.4clojure.p98-equivalence-classes-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-98-test
 (testing
  "Problem 98: A function f defined on a domain D\ninduces an equivalence relation on D, as follows:\na is equivalent to b with respect to f\nif and only if (f a) is equal to (f b).\nWrite a function with arguments f and D\nthat computes the equivalence classes of D with respect to f."
  (is
   (=
    (__ (fn* [p1__197#] (* p1__197# p1__197#)) #{0 1 -2 -1 2})
    #{#{1 -1} #{-2 2} #{0}}))
  (is
   (=
    (__ (fn* [p1__198#] (rem p1__198# 3)) #{0 1 4 3 2 5})
    #{#{0 3} #{1 4} #{2 5}}))
  (is (= (__ identity #{0 1 4 3 2}) #{#{3} #{2} #{1} #{0} #{4}}))
  (is (= (__ (constantly true) #{0 1 4 3 2}) #{#{0 1 4 3 2}}))))

