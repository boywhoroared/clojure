(ns
 boywhoroared.4clojure.p94-game-of-life-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-94-test
  (testing
   "Problem 94: "
    (is
     (=
      (__ ["      " " ##   " " ##   " "   ## " "   ## " "      "])
      ["      " " ##   " " #    " "    # " "   ## " "      "]))
    (is
     (=
      (__ ["     " "     " " ### " "     " "     "])
      ["     " "  #  " "  #  " "  #  " "     "]))
    (is
     (=
      (__ ["      " "      " "  ### " " ###  " "      " "      "])
      ["      " "   #  " " #  # " " #  # " "  #   " "      "]))))

