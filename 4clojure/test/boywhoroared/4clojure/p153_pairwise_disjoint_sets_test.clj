(ns
 boywhoroared.4clojure.p153-pairwise-disjoint-sets-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-153-test
  (testing
   "Problem 153: "
    (is (= (__ #{#{\L \P} #{\E \e \R} #{\U} #{\s} #{\.}}) true))
    (is
     (=
      (__ #{#{:c :b :a} #{:e :c :b :d :a} #{:c :b :d :a} #{:b :a} #{:a}})
      false))
    (is
     (=
      (__
       #{#{1 [3 4] 2 [5]}
         #{[1 2 3] [4 5]}
         #{4 3 5 [2] [1]}
         #{[3 4 5] [1 2]}})
      true))
    (is
     (= (__ #{#{''f ''a ''c} #{'c 'e 'd} #{'b 'a} #{'h 'f 'i 'g}}) true))
    (is
     (=
      (__
       #{#{#{} #{:z} #{:y :z :x} #{:y :x}}
         #{'(:x :y :z) '(:z) '(:x :y) '()}
         #{'[:x :y :z] [] {} [:x :y] [:z]}})
      false))
    (is
     (=
      (__
       #{#{(symbol "true") 'false}
         #{:yes :no}
         #{:user/no (keyword "yes")}
         #{0 (class 1)}
         #{false (= "true")}
         #{(class '1) (int \0)}})
      false))
    (is
     (=
      (__
       (set
        [(set [distinct?])
         (set
          [(fn* [p1__210#] (-> p1__210#))
           (fn* [p1__211#] (-> p1__211#))])
         (set
          [(fn* [p1__212#] (-> p1__212#))
           (fn* [p1__213#] (-> p1__213#))
           (fn* [p1__214#] (-> p1__214#))])
         (set
          [(fn* [p1__215#] (-> p1__215#))
           (fn* [p1__216#] (-> p1__216#))
           (fn* [p1__217#] (-> p1__217#))])]))
      true))
    (is
     (=
      (__
       #{#{contains? set nil? (do)}
         #{}
         #{mapcat '+ '* (comment mapcat)}
         #{'mapcat ((fn* [] (-> *))) +}})
      false))))

