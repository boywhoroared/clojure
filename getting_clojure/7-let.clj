;; Chapter 7 - Let

;;`def` is for long-lasting names
;;`let` is for short-term disposable names

;; `let` enables you mix intention revealing names into your code
;; and is suprisingly helpful in writing higher-order functions
;; (functions that take other functions as arguments [and return functions?])

;; A Local Temporary Pace For Your Stuff

;;  Our bookstore runs periodic specials. Every now and then we offer
;;  our customers a percentage discount on their book purchases.
;;  Unfortunately, the deal comes with fine-print: there's a minimum charge
;;  for each order that overrides the discount.

;; Armed with our knowwledge of functions and `if`, it's not difficult to
;; turn this discount policy into code

(defn compute-discount-amount [amount discount-percent min-charge]
  (if (> (* amount (- 1.0 discount-percent)) min-charge)
    (* amount (- 1.0 discount-percent))
    min-charge))

; If the discount is 20, then `discount-percent` is 0.20. 20% off means we pay 80% of the original price.
; (- 1.0 0.20) = 0.80.
; This, (* amount (- 1.0 discount-percent)) => (* 10 (- 1.0 0.20)) => (* 10 0.80)  to give the discounted-amount

;; The problem with this code is the names and calculations are not very clear
;; We need clearer names like "discounted-amount"

;; DON'T DO THIS
; (defn compute-discount-amount [amount discount-percent min-charge]
;   (def discounted-amount (* amount (- 1.0 discount-percent))) ; NOOOOOO
;   (if (> discounted-amount min-charge)
;     discounted-amount
;     min-charge))

;; WARNING
;; Do not use `def` within a function. 2 Reasons:
;; - `def` names are globally visible
;; - Semantically, `def` is used for values that remain more or less stable

;; This creates a nasty effect

(do
  (def discounted-amount "Some random string") ; You will actually get a warning in your linter/LSP because this is a string that will be redefined as a number
  (compute-discount-amount 10.0 0.20 1.0)
  (print discounted-amount)) ; `discounted-amount` is now 8.0

;; DO USE LET
(defn compute-discount-amount [amount discount-percent min-charge]
  (let [discounted-amount (* amount (- 1.0 discount-percent))] ; the bindings are now local with in the (let ...) sexpr
    (if (> discounted-amount min-charge)
      discounted-amount
      min-charge)))

(compute-discount-amount 10.0 0.20 1.0) ; 8.0

;; We can bind multiple names in a single `let`
(defn compute-discount-amount [amount discount-percent min-charge]
  (let [discount (* amount discount-percent)
        discounted-ammount (- amount discount)] ; we can use `discount` here because each name becomes available immediately after it's bound
    (if (> discounted-ammount min-charge)
      discounted-ammount
      min-charge)))
(compute-discount-amount 10.0 0.20 1.0) ; 8.0 [amount discount-percent min-charge]

;; We can use more than one expression in the let body
;; However, only the last expression dictates what value is returned by the let
(defn compute-discount-amount [amount discount-percent min-charge]
  (let [discount (* amount discount-percent)
        discounted-ammount (- amount discount)] ; we can use `discount` here because each name becomes available immediately after it's bound
    (println "Discount:" discount)
    (println "Discounted Amount:" discounted-ammount)
    (if (> discounted-ammount min-charge)
      discounted-ammount
      min-charge)))

(compute-discount-amount 10.0 0.20 1.0) ; 8.0 [amount discount-percent min-charge]

;; Let Over Fn (Combining `let` with `fn`)

;; Let's say we have some customer specific discounts at the bookstore.
;; Somewhere we have a map ofo the user's name to the discount they receive
(def user-discounts {"Nicholas" 0.10 "Jonathan" 0.07 "Felicia" 0.05})

;; Add parameters to `compute-discount-amount` to handle this
(defn compute-discount-amount-users [amount user-name user-discounts min-charge]
  (let [discount-percent (user-discounts user-name) ; Set `discount-percent` using map key lookup on user-name
        discount (* amount discount-percent)
        discounted-ammount (- amount discount)] ; we can use `discount` here because each name becomes available immediately after it's bound
    (if (> discounted-ammount min-charge)
      discounted-ammount
      min-charge)))

(compute-discount-amount-users 10 "Felicia", user-discounts 2.0) ; 9.5

;; The problem with this is now we need to "carry" the "user names and
;; discounts" table around every-time we want to compute a price

;; Getting Clojure, suggests that a better strategy might be a higher-level
;; function that produces customer specific variants of the discount function
(defn mk-discount-price-f [user-name user-discounts min-charge]
  (let [discount-percent (user-discounts user-name)]
    (fn [amount] ;; This `fn` expression is the last/only expression in the `let` so it is returned as the value
      (let [discount (* amount discount-percent) ;; This `fn` has access to the `discount-percent` bound in the `let`
            discounted-amount (- amount discount)]
        (if (> discounted-amount min-charge)
          discounted-amount
          min-charge)))))

;; Get a price function for Felicia
(def compute-felicia-price (mk-discount-price-f "Felicia" user-discounts 10.0))

;; ...and sometime later, compute a price
(compute-felicia-price 20.0) ; 19.0

;; P/N: When would it be useful to create functions for later like this?
;; I suppose one could create these functions and then put them into a map
;; If we're being super pure, rather than have the functions look up the discount
;; in the map, we could map over the user-name and discount table and create functions
(def user-discount-fns
  (reduce-kv (fn [m k v] ; a map is treated as a vector of key-value pairs
               (assoc m k (fn [amount min-charge]
                            (let [
                              discount-percent v
                              discount (* amount discount-percent)
                              discounted-amount (- amount discount)
                              ]
                              (if (> discounted-amount min-charge)
                                discounted-amount
                                min-charge))
              ))) {} user-discounts)) ; #'user/user-discount-fns


;; So now we have a table of discount fns that we can lookup and apply
(apply (user-discount-fns "Felicia") [ 20.0 1.0]) ; 19.0
;; Of course, this means you can't add a new Customer discount at runtime without regenerating `user-discount-fns`
;; It may be better then to have a fn that closes over only the user-discounts table

;; The interesting thing about mk-discount-price-f is how discount-percent gets bound
;; in the initial `let`, outside of the `fn` and then used *inside* the `fn` (closure).
;; That means that while `discount-percent` is only visible in the body of the `let`,
;; it can live on long after the call to `mk-discount-price-f` has completed, buried
;; inside of the anonymous function (This is closures as at work)

;; This "compute it in a let, use it in a fn" is a such a great way to build anonymous
;; functions that are both efficient and clear. It's efficient because you can use the
;; outside `let` to compute everything you need to construct the anonymous function.
;; And it's clear because inside of the anonymous function, you can use descriptive names
;; for those precomputed values.

;; My own preference for implementation would be to make a Closure around a function that
;; refers to the user discount table and keep the user-name and min-charge parameters

;; Variations on The Theme

(def anonymous-book {:title "Sir Gawain and the Green Knight"})

(def with-author
 {:title "Once and Future King" :author "White"} )

;; Imagine that we need to return the uppercase :author if it is present
;; or nil if it is not but we must avoid computing the uppercase of nil as
;; that will throw an exception

(defn uppercase-author [book]
  (let [author (:author book)]
    (if author (.toUpperCase author)))) ; We can use `.toUpperCase` (java interop) here strings are Java string objects

;; This works
(uppercase-author anonymous-book) ; nil
(uppercase-author with-author) ; "WHITE"

;; But we can say it more succinctly with...
(defn uppercase-author1 [book]
  (if-let [author (:author book)] (.toUpperCase author)))

;; `if-let` takes a single binding and uses the value bound as the conditional expr.
;; It functions like `if` after the binding, first expr for true, 2nd optional else expr for false
(defn uppercase-author2 [book]
  (if-let [author (:author book)] (.toUpperCase author) "ANONYMOUS"))

(uppercase-author2 anonymous-book) ; "ANONYMOUS"

;; There is also `when-let`
(defn uppercase-author-when [book]
  (when-let [author (:author book)]
    (println "the author is" author) ; `when-let`, like `when`, allows you to evalute multiple exprs in a block, returning the last expr
    (.toUpperCase author))) ; there is no `else`, nothing is evaluated if the condition is false


(comment
  (uppercase-author-when with-author)
  (uppercase-author-when anonymous-book)
  )

;;Staying Out of Trouble

;; Names defined in a `let` are exactly that: **defined inside the `let`**
;; `let` relies on lexical scope. The bindings created by let are only available
;; inside the code that makes up the `let` body


;; You can't, for example, do this:
(comment
  (let [title "Let's Pretend This Never Happened"] ; We can use title inside of the `let`
  (println "The title is" title)
  (print-the-title))

;; But now we're out of the `let`
(defn print-the-title []
  (println "The title is " title)) ;; Boom! an error
)


;; When nesting expressions, a binding in an inner `let` can mask/override a binding in an outer `let`
(let [title "Pride and Prejudice"]
  (let [title "Sense and Sensibility"]
    ( println title)))

;; You can also override a binding inside of the same `let`
(let [title "Pride and Prejudice" ;; Classic Novel
      title (str title " and Zombies")] ;; Now with the undead
  (println title)) ; Brains! lol
