(ns
  ^{:id 148 :difficulty "medium" :tags ["math"] :description "Write a function which calculates the sum of all natural
numbers under n (first argument) which are evenly divisible by at least one
of a and b (second and third argument). Numbers a and b are guaranteed to be coprimes.

Note: Some test cases have a very large n, so the most obvious solution will
exceed the time limit."} boywhoroared.4clojure.p148-the-big-divide-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-148-test
     (testing "Problem 148: Write a function which calculates the sum of all natural
numbers under n (first argument) which are evenly divisible by at least one
of a and b (second and third argument). Numbers a and b are guaranteed to be coprimes.

Note: Some test cases have a very large n, so the most obvious solution will
exceed the time limit."
       (is (= 0 (__ 3 17 11)))
(is (= 23 (__ 10 3 5)))
(is (= 233168 (__ 1000 3 5)))
(is (= "2333333316666668" (str (__ 100000000 3 5))))
(is (= "110389610389889610389610"
                      (str (__ (* 10000 10000 10000) 7 11))))
(is (= "1277732511922987429116"
                      (str (__ (* 10000 10000 10000) 757 809))))
(is (= "4530161696788274281"
                      (str (__ (* 10000 10000 1000) 1597 3571))))))