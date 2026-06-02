(ns boywhoroared.4clojure.generator
  "Generates unit test files from 4Clojure problem data.
  This module was LLM generated."
  (:require [clojure.string :as string]
            [clojure.pprint :refer [pprint]]
            [clojure.java.io :as io]
            [boywhoroared.4clojure.problems :refer [problems]]))

(def test-dir "test/boywhoroared/4clojure")

(defn sanitize-name [name-str]
  (-> name-str
      string/lower-case
      (string/replace #"[^a-z0-9\s-]" "")
      (string/replace #"\s+" "-")))

(defn generate-test-ast [problem]
  (let [id (:id problem)
        safe-name (sanitize-name (:title problem))
        ns-symbol (symbol (str "boywhoroared.4clojure.p" id "-" safe-name "-test"))
        ns-metadata (select-keys problem [:difficulty :tags :name :description])
        test-symbol (symbol (str "problem-" id "-test"))

        ;; Map 4Clojure test strings into live Clojure forms inside (is ...) blocks
        is-forms (map (fn [t-str] `(~'is ~(read-string t-str)))
                      (concat (:tests problem) (:secret-tests problem)))]

    ;; We return a vector of pure Clojure forms (the entire file's AST)
    [`(~'ns ~(with-meta ns-symbol ns-metadata)
       (:require [clojure.test :refer [~'deftest ~'is ~'testing]]))

     `(~'defn ~'__ [& ~'args]
              ~'(comment "Write your solution inside this function"))

     `(~'deftest ~test-symbol
                 (~'testing ~(str "Problem " id ": " (:name problem) (:description problem))
                            ~@is-forms))]))

(defn generate-test-file [problem]
  (let [safe-name (sanitize-name (:title problem))
        file-path (str test-dir "/p" (:id problem) "_" (string/replace safe-name "-" "_") "_test.clj")
        ;; 1. Generate the structure of the file as data
        file-ast (generate-test-ast problem)]

    (io/make-parents file-path)
    ;; 2. Spit the data natively using the pretty printer
    (with-open [w (io/writer file-path)]
      (binding [*out* w
                *print-meta* true]
        (doseq [form file-ast]
          (pprint form)
          (println)))))) ; Just one println to space out top-level forms cleanly

(defn -main []
  (println "Generating static test files natively from AST...")
  (doseq [prob problems]
    (generate-test-file prob))
  (println (str  "Done! Check your " test-dir " directory.")))

;; clojure -M -m boywhoroared.4clojure.generator
