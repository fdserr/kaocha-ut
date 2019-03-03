(ns ut.any-name
  (:require
   [#?(:clj clojure.test :cljs cljs.test) :refer [deftest is]]
   [ut.core :as ut]))

(deftest test-hello
  (is (= (ut/hello "World") "Hello World!")))
