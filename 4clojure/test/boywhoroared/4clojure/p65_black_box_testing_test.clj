(ns
 ^{:difficulty "medium", :tags ["seqs" "testing"], :description "Clojure has many collection types,\nwhich act in subtly different ways.\nThe core functions typically convert them into\na uniform \"sequence\" type and work with them that way,\nbut it can be important to understand the behavioral\nand performance differences so that you know\nwhich kind is appropriate for your application.\nWrite a function which takes a collection and returns one of:\nmap, :set, :list, or :vector -\ndescribing the type of collection it was given.\nYou won't be allowed to inspect their class\nor use the built-in predicates like list? -\nthe point is to poke at them and understand their behavior."} boywhoroared.4clojure.p65-black-box-testing-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-65-test
 (testing
  "Problem 65: Clojure has many collection types,\nwhich act in subtly different ways.\nThe core functions typically convert them into\na uniform \"sequence\" type and work with them that way,\nbut it can be important to understand the behavioral\nand performance differences so that you know\nwhich kind is appropriate for your application.\nWrite a function which takes a collection and returns one of:\nmap, :set, :list, or :vector -\ndescribing the type of collection it was given.\nYou won't be allowed to inspect their class\nor use the built-in predicates like list? -\nthe point is to poke at them and understand their behavior."
  (is (= :map (__ {:a 1, :b 2})))
  (is (= :list (__ (range (rand-int 20)))))
  (is (= :vector (__ [1 2 3 4 5 6])))
  (is (= :set (__ #{10 (rand-int 5)})))
  (is (= [:map :set :vector :list] (map __ [{} #{} [] ()])))))

