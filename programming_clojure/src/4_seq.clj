;; sequence or seq (pronounce "seek")

;; Seqs:
;; All Clojure collections
;; All Java collections
;; Strings and Java Arrays
;; RegEx Matches
;; Directory Structures
;; IO Streams
;; XML trees


(def aseq [1 2 3]) ;; Using a vector here because it seems Clojurians default to vectors rather than lists '()

(first aseq) ; 1
(rest aseq) ; (2 3)
(cons 4 aseq) ; (4 1 2 3)  ;; This creates a new sequence (remember immutable and structural sharing)

;; Get the seq view of any collection with (seq [coll])
(seq aseq) ; (1 2 3) ;; `aseq` is vector, it's seq view is (1 2 3)

;; seq returns a seq or nil. This is lets us seq for predicates and nil punning (truth or falsy)

;; `rest` always returns a seq, that's great for laziness but we can't use `rest` as a predicate
(next aseq) ; (seq (rest aseq)) - `next` is eager.
; (2 3)

(first '(1 2 3))
(rest '(1 2 3))
(cons 0 '(1 2 3))

;; cons is short for construct. This comes from Clojure's Lisp origins
;; cons *constructs* a new sequence, which is like the original sequence but with one element added

;; Applying seq functions to collections results in a seq
(seq? (rest [1 2 3])) ; [1 2 3]
; true

;; You can treat maps and sets as seqs

(first {:fname "Aaron" :lname "Bedra"}) ; [:fname "Aaron"] ;; Also note how in the book `lname` was returned, but I got `fname`. Maps have a stable traversal order but the order isn't guaranteed.
(rest {:fname "Aaron" :lname "Bedra"}) ; ([:lname "Bedra"]) ;; note this returned a seq!
(cons [:mname "James"] {:fname "Aaron" :lname "Bedra"}) ; ([:mname "James"] [:fname "Aaron"] [:lname "Bedra"])
;; NOTE: We cons'ed a VECTOR to a MAP, the result was a list of vectors
;; This is because seq functions sees Maps  as collections of two element vectors

;; You can treat sets as seqs
(first #{:the :quick :brown :fox}) ; :fox
(rest #{:the :quick :brown :fox}) ; (:the :quick :brown)
(cons :jumped #{:the :quick :brown :fox}) ; (:jumped :fox :the :quick :brown)

;; Again the order is weird but consistent/stable

;; Sort sets and maps before traversing

;; *Creates* a sorted set from args, sorted by natural sort order
(sorted-set :the :quick :brown :fox) ; #{:brown :fox :quick :the}

;; Creates a map sorted by key
(sorted-map :c 3 :b 2 :a 1) ; {:a 1, :b 2, :c 3}
;; Sorted maps won't come back in the order you put them either, but they will come back sorted by key.

(comment
  (require 'clojure.repl)
  (clojure.repl/doc sorted-map-by)
  (clojure.repl/doc sorted-set-by))

;; (conj coll element & elements)  adds one  or more elements to a collection
;; (into to-coll [xform] from-coll) adds all the items in one collection to another

(conj '(1 2 3) :a) ; (:a 1 2 3)
(into '(1 2 3) '(:a :b :c)) ; (:c :b :a 1 2 3)

;; With Vectors, `conj` and `into` add to the back/end of the list
;; This is because of the implementation of those data structures and doing efficienct operations

(conj [1 2 3] :a) ; [1 2 3 :a] ;; Note the difference with calling `conj` on lists
(into [1 2 3] [:a :b :c]) ; [1 2 3 :a :b :c]

; Sequences are logical lists, not concrete lists

(seq? '(1 2 3)) ; true
(seq? (seq '(1 2 3))) ; true

(list? '(1 2 3)) ; true
(list? (seq '(1 2 3))) ; true
;; seq still keeps the underlying structure of a seq created from a list as a list
;; and `list?` is checking that. That's why this evaluates to true

(comment
  (clojure.repl/source seq?)
  (clojure.repl/source list?))
;; No predicate for lazy?

(seq? (rest '(2 2 3)))
(list? (rest '(1 2 3)))

(list? (rest [1 2 3])) ; false
(seq? (rest [1 2 3])) ; true
(list? (range 10)) ; false  ;; Lazy list/seq is not a list
(seq? (range 10)) ; true ;; Range is a type of clojure.lang.LazySeq

;; seq? does not distinguish between sequences and lazy sequences

;; Sequences never change. They do not mutate. Sequence functions returns a changed *copy*.

;; Creating Sequences

;; Range
(range 10) ; end only
(range 10 20) ; start and end
; (10 11 12 13 14 15 16 17 18 19)

(range 1 25 2) ; step by 2
; (1 3 5 7 9 11 13 15 17 19 21 23)

(range 0 -1 -0.25) ; negative step
; (0 -0.25 -0.5 -0.75)

(range 1/2 4 1) ; ratios
; (1/2 3/2 5/2 7/2)

;; Repeat
;; `repeat` repeats an element, x, n times
;; (repeat n x)

(repeat 5 1) ; (1 1 1 1 1)
(repeat 10 "x") ; ("x" "x" "x" "x" "x" "x" "x" "x" "x" "x")

;; If N is omited, it creates an infinite series of xs
;; That said, (repeat) returns a lazy seq
(clojure.repl/doc repeat)

;; Iterate (iterate f x)
;; Begins with a value x and continues forever applying a function f to each value to calculate the next
;; (Something like an infinite reduce?)

(take 10 (iterate inc 1)) ; (1 2 3 4 5 6 7 8 9 10)
; take copies the first n items from the seq
; iterate keeps calling `inc` on each successive value

(def whole-numbers (iterate inc 1)) ; whole numbers is pretty useful sequence to have around, so we've named it for future use

;; (take n sequence)
;; Returns a lazy sequence of the first n items from a collection
;; it provides one way to create a finite view onto an infinite collection

(take 20 (repeat 1)) ; (1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1)

;; Cycle takes a collection and cycles it infinitely
;; (cyle coll)

(take 10 (cycle (range 3))) ; (0 1 2 0 1 2 0 1 2 0)

;; interlave takes multiple collections and produces a new
;; collection that cycles through each collection taking the
;; next value until one of the collections is exhausted
;; (interleave & colls)

(interleave whole-numbers ["A" "B" "C" "D" "E"]) ; (1 "A" 2 "B" 3 "C" 4 "D" 5 "E")

;; interpose returns a sequence with each of the
;; elements of the input collection segregated by a separator:

(interpose "," (take 5 whole-numbers)) ; (1 "," 2 "," 3 "," 4 "," 5)
(interpose "," ["apples" "bananas" "grapes"])  ; ("apples" "," "bananas" "," "grapes")

(apply str (interpose "," ["apples" "bananas" "grapes"])) ; "apples,bananas,grapes"
; isn't this just `join` ?

(require '[clojure.string :refer [join]])
(join \, ["apples", "bananas" "grapes"]) ; "apples,bananas,grapes"

;; `join` is a performance optimised version of the above appy + interpose incantation

