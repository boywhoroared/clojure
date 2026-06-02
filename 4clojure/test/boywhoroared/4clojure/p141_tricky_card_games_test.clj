(ns
 ^{:difficulty "medium", :tags ["game" "cards"], :description "In trick-taking card games such as bridge, spades,\nor hearts, cards are played in groups known as \"tricks\" - each player\nplays a single card, in order; the first player is said to \"lead\" to\nthe trick. After all players have played, one card is said to have \"won\"\nthe trick. How the winner is determined will vary by game, but generally\nthe winner is the highest card played in the suit that was led. Sometimes\n(again varying by game), a particular suit will be designated \"trump\",\nmeaning that its cards are more powerful than any others: if there is a\ntrump suit, and any trumps are played, then the highest trump wins\nregardless of what was led.\n\nYour goal is to devise a function that can determine which of a number of\ncards has won a trick. You should accept a trump suit, and return a function\nwinner. Winner will be called on a sequence of cards, and should return the\none which wins the trick. Cards will be represented in the format returned\nby Problem 128, Recognize Playing Cards: a hash-map of :suit and a numeric\n:rank. Cards with a larger rank are stronger."} boywhoroared.4clojure.p141-tricky-card-games-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-141-test
 (testing
  "Problem 141: In trick-taking card games such as bridge, spades,\nor hearts, cards are played in groups known as \"tricks\" - each player\nplays a single card, in order; the first player is said to \"lead\" to\nthe trick. After all players have played, one card is said to have \"won\"\nthe trick. How the winner is determined will vary by game, but generally\nthe winner is the highest card played in the suit that was led. Sometimes\n(again varying by game), a particular suit will be designated \"trump\",\nmeaning that its cards are more powerful than any others: if there is a\ntrump suit, and any trumps are played, then the highest trump wins\nregardless of what was led.\n\nYour goal is to devise a function that can determine which of a number of\ncards has won a trick. You should accept a trump suit, and return a function\nwinner. Winner will be called on a sequence of cards, and should return the\none which wins the trick. Cards will be represented in the format returned\nby Problem 128, Recognize Playing Cards: a hash-map of :suit and a numeric\n:rank. Cards with a larger rank are stronger."
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

