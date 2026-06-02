(ns
 boywhoroared.4clojure.p117-for-science-test
  (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
  problem-117-test
  (testing
   "Problem 117: "
    (is (= true (__ ["M   C"])))
    (is (= false (__ ["M # C"])))
    (is
     (= true (__ ["#######" "#     #" "#  #  #" "#M # C#" "#######"])))
    (is
     (=
      false
      (__
       ["########"
        "#M  #  #"
        "#   #  #"
        "# # #  #"
        "#   #  #"
        "#  #   #"
        "#  # # #"
        "#  #   #"
        "#  #  C#"
        "########"])))
    (is
     (=
      false
      (__ ["M     " "      " "      " "      " "    ##" "    #C"])))
    (is
     (= true (__ ["C######" " #     " " #   # " " #   #M" "     # "])))
    (is
     (=
      true
      (__
       ["C# # # #"
        "        "
        "# # # # "
        "        "
        " # # # #"
        "        "
        "# # # #M"])))))

