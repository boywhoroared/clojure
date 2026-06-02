(ns
 boywhoroared.4clojure.p140-veitch-please-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-140-test
  (testing
   "Problem 140: "
    (is
     (=
      (__
       #{#{'A 'B 'C 'd}
         #{'B 'C 'a 'd}
         #{'A 'B 'c 'd}
         #{'A 'C 'b 'd}
         #{'A 'C 'b 'D}
         #{'A 'b 'c 'd}
         #{'A 'b 'c 'D}
         #{'A 'B 'c 'D}})
      #{#{'A 'c} #{'A 'b} #{'B 'C 'd}}))
    (is (= (__ #{#{'A 'B 'C 'd} #{'A 'B 'C 'D}}) #{#{'A 'B 'C}}))
    (is
     (=
      (__
       #{#{'b 'c 'a 'd}
         #{'B 'c 'a 'd}
         #{'b 'c 'a 'D}
         #{'A 'B 'C 'd}
         #{'A 'C 'b 'd}
         #{'A 'C 'b 'D}
         #{'B 'c 'a 'D}
         #{'A 'B 'C 'D}})
      #{#{'c 'a} #{'A 'C}}))
    (is
     (=
      (__ #{#{'C 'b 'a} #{'B 'C 'a} #{'B 'c 'a} #{'b 'c 'a}})
      #{#{'a}}))
    (is
     (=
      (__
       #{#{'B 'c 'a 'd}
         #{'b 'c 'a 'D}
         #{'A 'B 'C 'd}
         #{'A 'C 'b 'D}
         #{'B 'C 'a 'D}
         #{'A 'B 'c 'D}})
      #{#{'B 'c 'a 'd}
        #{'b 'c 'a 'D}
        #{'A 'B 'C 'd}
        #{'A 'C 'b 'D}
        #{'B 'C 'a 'D}
        #{'A 'B 'c 'D}}))
    (is
     (=
      (__
       #{#{'b 'c 'a 'd}
         #{'B 'c 'a 'd}
         #{'b 'c 'a 'D}
         #{'A 'B 'c 'd}
         #{'B 'c 'a 'D}
         #{'A 'B 'c 'D}})
      #{#{'c 'a} #{'B 'c}}))
    (is
     (=
      (__
       #{#{'B 'c 'a 'd}
         #{'b 'c 'a 'D}
         #{'A 'B 'C 'd}
         #{'B 'C 'a 'd}
         #{'A 'B 'c 'd}
         #{'A 'C 'b 'D}
         #{'A 'b 'c 'D}
         #{'C 'b 'a 'D}})
      #{#{'B 'd} #{'b 'D}}))
    (is
     (=
      (__
       #{#{'b 'c 'a 'd}
         #{'A 'C 'b 'd}
         #{'C 'b 'a 'd}
         #{'A 'b 'c 'd}
         #{'B 'C 'a 'D}
         #{'B 'c 'a 'D}
         #{'A 'B 'c 'D}
         #{'A 'B 'C 'D}})
      #{#{'b 'd} #{'B 'D}}))
    (is
     (=
      (__
       #{#{'b 'c 'a 'd}
         #{'A 'C 'b 'd}
         #{'C 'b 'a 'd}
         #{'A 'b 'c 'd}
         #{'B 'C 'a 'D}
         #{'B 'c 'a 'D}
         #{'A 'B 'c 'D}
         #{'A 'B 'C 'D}})
      #{#{'b 'd} #{'B 'D}}))))

