(ns
  ^{:id 102 :difficulty "medium" :tags ["strings"] :description "When working with java,
you often need to create an object with fieldsLikeThis,
but you'd rather work with a hashmap
that has :keys-like-this until it's time to convert.
Write a function which takes
lower-case hyphen-separated strings
and converts them to camel-case strings."} boywhoroared.4clojure.p102-intocamelcase-test
  (:require [clojure.test :refer [deftest is testing run-tests]]))

(defn __ [& args] (comment "Write your solution in this fn"))

(deftest problem-102-test
     (testing "Problem 102: When working with java,
you often need to create an object with fieldsLikeThis,
but you'd rather work with a hashmap
that has :keys-like-this until it's time to convert.
Write a function which takes
lower-case hyphen-separated strings
and converts them to camel-case strings."
       (is (= (__ "something") "something"))
(is (= (__ "multi-word-key") "multiWordKey"))
(is (= (__ "leaveMeAlone") "leaveMeAlone"))))