(def title "Emma")

;; Everyone's favourite universal constant
(def PI 3.14)

;; Length of a standard Book ID
(def ISBN-LENGTH 13)

;; This `defn` is a more convenient way of writing `(def name (fn [] ...))`
(defn book-description [book]
  (str (:title book) " Written by" (:author book)))

(def book-description
  (fn [book] (str (:title book) " Writteny by" (:author book))))

;; The bindings created by `def` widely visible. You can use them in other defs and inside of functions

(def OLD-ISBN-LENGTH 10) ; Before 2007 ISBNs were 10 characters long
(def isbn-lengths [OLD-ISBN-LENGTH ISBN-LENGTH])

(defn valid-isbn [isbn]
  (or (= (count isbn) OLD-ISBN-LENGTH)
      (= (count isbn) ISBN-LENGTH)))

(defn valid-isbn2 [isbn]
  (let [length (count isbn)]
    (or (= length OLD-ISBN-LENGTH)
        (= length ISBN-LENGTH))))

;; A/N: Just an experiment since we just finished looking at `let`
(defn valid-isbn3 [isbn]
  (let [length (count isbn)
        is-old-isbn (= length OLD-ISBN-LENGTH)
        is-isbn (= length ISBN-LENGTH)]
    (or is-old-isbn is-isbn)))

(valid-isbn2 "1001234567891") ; true

(valid-isbn3 "1001234567891") ; true


;; SYMBOLS ARE THINGS

;; What does `def` do?
;; `def` binds a **symbol** to a **value**

;; Creates a symbol 'author bound to the value "Austen"
(def author "Austen")

'author
'title

;; Evaluating a symbol returns the value that it is bound to
(str 'author)
(println author)


;; I vaguely remember something about var/symbol forms and referencing them
;; with #'
(println  #'author)

;; In clojure, you can refer to the symbol itself using `'`
(str 'author) ; "author"

;; In this way, symbols are just another value. The idea here is that
;; symbols are not magical things that are built into the language.
;; A SYMBOL IS JUST ANOTHER KIND OF VALUE.

;; You can compare them
(= 'author 'some-other-symbol) ; false
(= 'author 'title) ; false
(= 'author 'author) ; true
(= 'title 'title) ; true

;; Being a value means that symbols can exist on their own, without
;; being bound to another value.
;; As above, you can make symbols without using `def`.
;; They are perfectly good expressions.


;; Bindings Are Things Too (vars)

;; The **bindings** between symbols and values, the things created by
;; `def`, are also ordinary values.
;; When you evaluate a `def`, Clojure creates a `var`, a thing that
;; represents the binding between a symbol and a value.

(def author "Austen")

;; You can get a var with a proper incantation, using a # followed by a ':
#'author

;; Like any other Clojure value, you can use vars in the business end of a `def`
(def the-var #'author)

;; And if you know the API, you can get at both the value and the symbol buried
;; inside fo the var

(.get the-var) ; "Austen"
(.-sym the-var) ; author

;; A/N This looks like Java interop calls, so yeah, everything (or almost everything)
;; is an object/class in the JVM, and if vars are aslo things, those things would be
;; Objects

;; A/N Using the var/binding is the trick that we used in the Caveman tutorial to
;; get the value of symbol even when it's value changes without having to reinvoke a fn
;; We need to look at how that worked

;; Clojure Caveman tutorial uses code like
(comment
  (partial #'hello-handler system)
  ; Passing the **var**, rather than the value of the var (using `hello-handler`), allows `partial` to use
  ; the current value of the var when we're reevaluating code at the REPL.
  ; When we use the symbol name, `hello-handler`, partial is passed the value (the actual function)
  ; However, when we use the `var`, the binding, the var is dereferenced and the current value is used
  ; See <https://clojure.org/guides/faq#partial>
  (defn -main []
    (jetty/run-jetty #'handler {:port 9999})))

;;  > When we call jetty/run-jetty we give it that handler function.
;; > A small wrinkle is that little #' in front. That makes it so that if you
;; > reload that function in a REPL the server will use the new definition right away.
;; > For more details on how that works you can dig into Clojure Vars.
;; > All you need to know is that when you want to pass a function as an argument
;; > and have it work with the REPL, you need to put #' in front.

;; See <https://clojure.org/reference/vars> and <https://clojure.org/guides/faq#partial>
;; Interesting the metadata you can use <https://clojure.org/reference/vars>


;; Varying Your Vars

;; `vars` are mutable  (we can redefine that as much as we please) because it is more
;; productive in development (especially when programming at the REPL) but refrain from
;; changing them in production

;;  We can def and re-def our vars with wild abandon. While Clojure loves immutability,
;;  this is simple and pragmatic for more productive development at the REPL.

;; For example while developing, we might start with creating a few vars...

;; (imagine the below code is being type at the repl)
;; user=> (def PI 3.14)

(comment
(def PI 3.14)

(defn compute-area [diameter]
  (* PI diameter diameter))

;; then realise we nee more precision, so we can rebind it...
(def PI 3.14159)

;; then realise we got the calculation wrong
(defn compute-area [radius diameter]
  (* PI radius (/ diameter 2.0)))

  )

;; NOTE: If you need to deal with changing state, you have some options with atoms, refs, or agents

;; You should mostly leave vars alone but there are times when it's handy to be able
;; to temporarily change the values bound in your vars.

; Imagine for example, you write a simple logging function that uses a var
; to turn the actual output on or off

(comment
  ;; First cut at debugging, needs some work
  (def debug-enabled false)
  (defn debug [msg]
    (if debug-enabled
      (println msg))))
;; But how do you turn on the logging without violating the clojure prime-directive of no `def`s in a function?
;; Its  for situations like these that Clojure gives you `binding`

; Binding `binding`
(comment
  (defn some-troublesome-function-that-needs-logging []
    (println "Do something troublesome"))

  ;; any var used with `binding` needs to be declared as dynamic
  (def ^:dynamic *debug-enabled* false)

  ;; ^:dynamic adds a bit of metadata to the var
  ;; And there is a Clojure convention for naming dynamic vars: surround them in asterisks
  ;; This is charmingly referred to as _earmuffs_

  (defn debug [msg]
    (if *debug-enabled*
      (println msg)))

  (binding [*debug-enabled* true]
    (debug "calling that darned function")
    (some-troublesome-function-that-needs-logging)
    (debug "Back from that darned function"))

  )

;; STAYING OUT OF TROUBLE

;; The biggest danger vars pose to the new Clojure programmer grows out of the
;; fact that vars look a lost like familiar variables taht we find in traditional
;; programming languages.
;;

;; - Do not try to use vars as a variables. In particular,
;;   don't rely on changing the value of a var to model changing state of the outside world.

;; - Do not use vars to weave parts of your program together with intention revealing names.
;;   `def` your values, `defn` your functions and leave them alone! You should rarely be
;;   rebinding symbols to different values (RDD aside?)
;;
;; - `let` does not create vars. There are no `var`s behind `let` bindings. The bindings
;;   produced by `let` are more like the variables are in other programming languages,
;;   implemented by some behind-the-scenes magic performed by the Clojure compiler.
;;   (`let` actually creates new local JVM platform variables in the compiled code on the stack/method frame)

;; `let` does not create vars. Don't do this:
(require '[clojure.repl :as repl])
(let [let-bound 42] #'let-bound)
(repl/pst) ; CompilerException java.lang.RuntimeException: Unable to resolve var: let-bound...

;; In the Wild

;; `set!` changes the value of a dynamic var from *inside* of the
;; binding

;; When Clojure runs your program, it's actually running within a binding like:

(binding [*print-length* nil]
  (run-your-code))

;; So, within that binding, our code could look like:
(def books ["Emma" "2001" "Jaws" "Oliver Twist"])
(set! *print-length* 2)
books

;; You will only see
;; user=> books
;; ["Emma" "2001" ...]
