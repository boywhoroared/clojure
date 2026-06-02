(ns
 ^{:difficulty "easy", :tags ["fun" "brain-teaser"], :description "Enter a value which satisfies the following:"} boywhoroared.4clojure.p126-through-the-looking-class-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-126-test
 (testing
  "Problem 126: Enter a value which satisfies the following:"
  (is (let [x __] (and (= (class x) x) x)))))

