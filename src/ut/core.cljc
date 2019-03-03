(ns ut.core
  (:require
   [#?(:clj clojure.test :cljs cljs.test) :refer [deftest is]]))

(defn hello
  [s]
  (str "Hello " s "!"))

(deftest test-hello-embedded
  (is (= (hello "World") "Hello World!")))
