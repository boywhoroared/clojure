(ns
 ^{:difficulty "easy", :tags ["strings" "game"], :description "A standard American deck of playing cards has four suits - spades,\nhearts, diamonds, and clubs - and thirteen cards in each suit. Two is the lowest rank,\nfollowed by other integers up to ten; then the jack, queen, king, and ace.\n\nIt's convenient for humans to represent these cards as suit/rank pairs, such as H5 or DQ:\nthe heart five and diamond queen respectively. But these forms are not convenient for\nprogrammers, so to write a card game you need some way to parse an input string into\nmeaningful components. For purposes of determining rank, we will define the cards to\nbe valued from 0 (the two) to 12 (the ace)\n\nWrite a function which converts (for example) the string \"SJ\" into a map of\n{:suit :spade,:rank 9}. A ten will always be represented with the single character\n\"T\", rather than the two characters \"10\"."} boywhoroared.4clojure.p128-recognize-playing-cards-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-128-test
 (testing
  "Problem 128: A standard American deck of playing cards has four suits - spades,\nhearts, diamonds, and clubs - and thirteen cards in each suit. Two is the lowest rank,\nfollowed by other integers up to ten; then the jack, queen, king, and ace.\n\nIt's convenient for humans to represent these cards as suit/rank pairs, such as H5 or DQ:\nthe heart five and diamond queen respectively. But these forms are not convenient for\nprogrammers, so to write a card game you need some way to parse an input string into\nmeaningful components. For purposes of determining rank, we will define the cards to\nbe valued from 0 (the two) to 12 (the ace)\n\nWrite a function which converts (for example) the string \"SJ\" into a map of\n{:suit :spade,:rank 9}. A ten will always be represented with the single character\n\"T\", rather than the two characters \"10\"."
  (is (= {:suit :diamond, :rank 10} (__ "DQ")))
  (is (= {:suit :heart, :rank 3} (__ "H5")))
  (is (= {:suit :club, :rank 12} (__ "CA")))
  (is
   (=
    (range 13)
    (map
     (comp :rank __ str)
     '[S2 S3 S4 S5 S6 S7 S8 S9 ST SJ SQ SK SA])))))

