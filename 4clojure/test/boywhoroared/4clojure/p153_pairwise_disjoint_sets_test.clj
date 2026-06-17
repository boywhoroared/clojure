(ns
  ^{:id 153 :difficulty "easy" :tags ["set-theory"] :description "Given a set of sets, create a function which returns true if no
two of those sets have any elements in common (1) and false otherwise. Some of the
test cases are a bit tricky, so pay a little more attention to them.

(1) Such sets are usually called pairwise disjoint or mutually disjoint."} boywhoroared.4clojure.p153-pairwise-disjoint-sets-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-153-test
     (testing "Problem 153: Given a set of sets, create a function which returns true if no
two of those sets have any elements in common (1) and false otherwise. Some of the
test cases are a bit tricky, so pay a little more attention to them.

(1) Such sets are usually called pairwise disjoint or mutually disjoint."
       (is (= (__ #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
                       true))
(is (= (__ #{#{:a :b :c :d :e}
                             #{:a :b :c :d}
                             #{:a :b :c}
                             #{:a :b}
                             #{:a}})
                       false))
(is (= (__ #{#{[1 2 3] [4 5]}
                             #{[1 2] [3 4 5]}
                             #{[1] [2] 3 4 5}
                             #{1 2 [3 4] [5]}})
                       true))
(is (= (__ #{#{'a 'b}
                             #{'c 'd 'e}
                             #{'f 'g 'h 'i}
                             #{''a ''c ''f}})
                       true))
(is (= (__ #{#{'(:x :y :z) '(:x :y) '(:z) '()}
                             #{#{:x :y :z} #{:x :y} #{:z} #{}}
                             #{'[:x :y :z] [:x :y] [:z] [] {}}})
                       false))
(is (= (__ #{#{(= "true") false}
                             #{:yes :no}
                             #{(class 1) 0}
                             #{(symbol "true") 'false}
                             #{(keyword "yes") ::no}
                             #{(class '1) (int \0)}})
                       false))
(is (= (__ (set [(set [distinct?])
                                 (set [#(-> %) #(-> %)])
                                 (set [#(-> %) #(-> %) #(-> %)])
                                 (set [#(-> %) #(-> %) #(-> %)])]))
                       true))
(is (= (__ #{#{(#(-> *)) + (quote mapcat) #_ nil}
                             #{'+ '* mapcat (comment mapcat)}
                             #{(do) set contains? nil?}
                             #{, , , #_, , empty?}})
                       false))))