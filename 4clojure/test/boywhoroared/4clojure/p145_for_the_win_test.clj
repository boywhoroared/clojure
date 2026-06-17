(ns
  ^{:id 145 :difficulty "elementary" :tags ["core-functions" "seqs"] :description "Clojure's for macro is a tremendously versatile mechanism for
producing a sequence based on some other sequence(s). It can take some time to
understand how to use it properly, but that investment will be paid back with
clear, concise sequence-wrangling later. With that in mind, read over these for
expressions and try to see how each of them produces the same result."} boywhoroared.4clojure.p145-for-the-win-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(def __ (comment "Write the solution value here"))

(deftest problem-145-test
     (testing "Problem 145: Clojure's for macro is a tremendously versatile mechanism for
producing a sequence based on some other sequence(s). It can take some time to
understand how to use it properly, but that investment will be paid back with
clear, concise sequence-wrangling later. With that in mind, read over these for
expressions and try to see how each of them produces the same result."
       (is (= __ (for [x (range 40)
                               :when (= 1 (rem x 4))]
                           x)))
(is (= __ (for [x (iterate #(+ 4 %) 0)
                               :let [z (inc x)]
                               :while (< z 40)]
                           z)))
(is (= __ (for [[x y] (partition 2 (range 20))]
                           (+ x y))))))