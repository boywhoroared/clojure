(ns
 ^{:difficulty "medium", :tags ["strings"], :description "When working with java,\nyou often need to create an object with fieldsLikeThis,\nbut you'd rather work with a hashmap\nthat has :keys-like-this until it's time to convert.\nWrite a function which takes\nlower-case hyphen-separated strings\nand converts them to camel-case strings."} boywhoroared.4clojure.p102-intocamelcase-test
 (:require [clojure.test :refer [deftest is testing]]))

(defn
 __
 [& args]
 ^{:line 33, :column 17}
 (comment "Write your solution inside this function"))

(deftest
 problem-102-test
 (testing
  "Problem 102: When working with java,\nyou often need to create an object with fieldsLikeThis,\nbut you'd rather work with a hashmap\nthat has :keys-like-this until it's time to convert.\nWrite a function which takes\nlower-case hyphen-separated strings\nand converts them to camel-case strings."
  (is (= (__ "something") "something"))
  (is (= (__ "multi-word-key") "multiWordKey"))
  (is (= (__ "leaveMeAlone") "leaveMeAlone"))))

