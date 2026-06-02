(ns
 boywhoroared.4clojure.p141-tricky-card-games-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn __ [& args] (comment "Write your solution inside this function"))

(deftest
 problem-141-test
 (testing
  "Problem 141: "
  (is
   (let
    [notrump (__ nil)]
    (and
     (=
      {:suit :club, :rank 9}
      (notrump [{:suit :club, :rank 4} {:suit :club, :rank 9}]))
     (=
      {:suit :spade, :rank 2}
      (notrump [{:suit :spade, :rank 2} {:suit :club, :rank 10}])))))
  (is
   (=
    {:suit :club, :rank 10}
    ((__ :club) [{:suit :spade, :rank 2} {:suit :club, :rank 10}])))
  (is
   (=
    {:suit :heart, :rank 8}
    ((__ :heart)
     [{:suit :heart, :rank 6}
      {:suit :heart, :rank 8}
      {:suit :diamond, :rank 10}
      {:suit :heart, :rank 4}])))))

