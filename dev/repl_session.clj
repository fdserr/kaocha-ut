;;; NOT A NS
;;; Clojure/Script REPL Session

(require '[ut.core :as ut] :reload)
(require 'ut.core-test :reload)

;;; clj tests
(require '[clojure.test :as t])
;;; cljs tests
(require '[cljs.test :as t])

(t/run-tests 'ut.core-test)

;;;
;;; Kaocha tests
(require '[kaocha.repl :as k])
(k/run :unit)
(k/run :unit-cljs)

;;; Kaocha diagnose
(k/config)
(pp)
(k/test-plan)
(pp)
