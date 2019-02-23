# ut (under tests)

Sample project tested under [Kaocha](https://github.com/lambdaisland/kaocha).

## Assuming

- Clojure [Deps/CLI](https://clojure.org/guides/getting_started) installed
- clones of `kaocha` and `kaocha-cljs` repos present in `../` (or change `deps.edn`)


## Objectives

### Clojure
- [x] REPL
- [x] Command line
- [ ] Circle CI

### ClojureScript
- [ ] Browser REPL
- [ ] Node REPL
- [ ] Command line
- [ ] Circle CI

### Integration
- [ ] Local
- [ ] Circle CI


## Status

### Clojure REPL
```
$ clj -Akaocha:dev
Clojure 1.10.0
user=> (require '[kaocha.repl :as k])
nil
user=> (k/run :unit)
[(.)]
1 tests, 1 assertions, 0 failures.
#:kaocha.result{:count 1, :pass 1, :error 0, :fail 0, :pending 0}
```

### Clojure command line
```
$ chmod +x bin/kaocha
$ bin/kaocha unit
[(.)]
1 tests, 1 assertions, 0 failures.
```
