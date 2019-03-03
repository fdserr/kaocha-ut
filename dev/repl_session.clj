;;; NOT A NS
;;; Clojure/Script REPL Session

clj -Akaocha:dev

;;; clj tests
(require '[clojure.test :as t])

;;; cljs tests
(require '[cljs.test :as t])

(require '[ut.core :as ut]
         'ut.core-test
         'ut.any-name
         :reload)

(t/run-all-tests)

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


;;; NS patterns
(re-matches #".*" "ut.core")
