(ns
 boywhoroared.4clojure.p126-through-the-looking-class-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-126-test
 (testing "Problem 126: " (is (let [x __] (and (= (class x) x) x)))))

