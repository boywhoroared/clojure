(ns boywhoroared.4clojure.generator
  "Generates unit test files from 4Clojure problem data.
  This module was LLM generated."
  (:require [clojure.string :as string]
            [clojure.pprint :refer [pprint write]]
            [clojure.math :as math]
            [clojure.java.io :as io]
            [boywhoroared.4clojure.problems :refer [problems]]))

(def test-dir "test/boywhoroared/4clojure")

(defn sanitize-name [name-str]
  (-> name-str
      string/lower-case
      (string/replace #"[^a-z0-9\s-]" "")
      (string/replace #"\s+" "-")))

(defn test-ns-form [problem]
  (let [safe-name (sanitize-name (:title problem))
        ns-symbol (symbol (str "boywhoroared.4clojure.p" (:id problem) "-" safe-name "-test"))
        ns-metadata (select-keys problem [:id :difficulty :tags :description])
        ns-with-metadata (with-meta ns-symbol ns-metadata)]
    `(~'ns ~ns-with-metadata (:require [clojure.test :refer [~'deftest ~'is ~'testing ~'run-tests]]))))

(defn test-ns-string [problem]
  (let [safe-name (sanitize-name (:title problem))
        ns-name (str "boywhoroared.4clojure.p" (:id problem) "-" safe-name "-test")
        ns-metadata (format "^{:id %d :difficulty \"%s\" :tags %s :description \"%s\"}"
                            (:id problem)
                            (:difficulty problem)
                            (pr-str (:tags problem))
                            (:description problem))]
    (format "(ns\n  %s %s\n  (:require [clojure.test :refer [deftest is testing run-tests]]))"
            ns-metadata
            ns-name)))

(defn write-a-fn? [problem]
  (let [index (string/index-of (string/lower-case (:description problem)) "write a function")]
    (if index true false)))

(comment
  (def description (string/lower-case "Write a function which removes the duplicates from a sequence"))
  (string/index-of description "write a function")
  (write-a-fn? {:description description})
  #_())

(defn test-solution-string [problem]
  (let [use-defn (write-a-fn? problem)]
    (if use-defn
      "(defn __ [& args] (comment \"Write your solution in this fn\"))"
      "(def __ (comment \"Write the solution value here\"))")))

(defn test-unit-test-string [problem]
  (let [test-name (str "problem-" (:id problem) "-test")
        test-description (format "\"Problem %s: %s\"", (:id problem) (:description problem))
        test-forms-string (string/join "\n" (mapv #(format "(is %s)" %) (:tests problem)))]
    (format
     "(deftest %s
     (testing %s
       %s))" test-name test-description test-forms-string)))

(defn generate-test-file [problem]
  (let [safe-name (sanitize-name (:title problem))
        file-path (str test-dir "/p" (:id problem) "_" (string/replace safe-name "-" "_") "_test.clj")]

    (io/make-parents file-path)
    ;; 2. Spit the data natively using the pretty printer
    (with-open [w (io/writer file-path)]
      (.write w (test-ns-string problem))
      (.write w "\n\n")
      (.write w (test-solution-string problem))
      (.write w "\n\n")
      (.write w (test-unit-test-string problem))))) ; Use `.write` as raw source/string so that we don't used the reader and expand macros like #()

(defn -main []
  (println "Generating static test files natively from AST...")
  (doseq [prob (drop 14 problems)]
    (generate-test-file prob))
  (println (str  "Done! Check your " test-dir " directory.")))

(-main)

;; clojure -M -m boywhoroared.4clojure.generator
