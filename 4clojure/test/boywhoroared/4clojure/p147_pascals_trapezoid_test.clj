(ns
 ^{:difficulty "easy", :tags ["seqs"], :description "Write a function that, for any given input vector of numbers, returns\nan infinite lazy sequence of vectors, where each next one is constructed from the\nprevious following the rules used in Pascal's Triangle. For example, for [3 1 2], the\nnext row is [3 4 3 2].\n\nBeware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an\narithmetic operator like + and the result is too large to fit into a 64-bit integer,\nan exception is thrown. You can use +' to indicate that you would rather overflow into\nClojure's slower, arbitrary-precision bigint."} boywhoroared.4clojure.p147-pascals-trapezoid-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-147-test
 (testing
  "Problem 147: Write a function that, for any given input vector of numbers, returns\nan infinite lazy sequence of vectors, where each next one is constructed from the\nprevious following the rules used in Pascal's Triangle. For example, for [3 1 2], the\nnext row is [3 4 3 2].\n\nBeware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an\narithmetic operator like + and the result is too large to fit into a 64-bit integer,\nan exception is thrown. You can use +' to indicate that you would rather overflow into\nClojure's slower, arbitrary-precision bigint."
  (is (= (second (__ [2 3 2])) [2 5 5 2]))
  (is (= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
  (is (= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]]))
  (is (= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2])))))))

