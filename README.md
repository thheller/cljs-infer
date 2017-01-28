See `src/dev/build.clj`.

`:infer-warnings` in `cljs.analyzer/*cljs-warnings*` is set to true for everything.

`lein run -m build/once`

This would produce many more messages but `Using cached cljs.core out/cljs/core.cljs` silently hides them.

```
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/clojurescript/1.9.456/clojurescript-1.9.456.jar!/cljs/core.cljs to out/cljs/core.cljs
Reading analysis cache for jar:file:/Users/zilence/.m2/repository/org/clojure/clojurescript/1.9.456/clojurescript-1.9.456.jar!/cljs/core.cljs
Compiling out/cljs/core.cljs
Using cached cljs.core out/cljs/core.cljs
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/clojurescript/1.9.456/clojurescript-1.9.456.jar!/cljs/spec/impl/gen.cljs to out/cljs/spec/impl/gen.cljs
Compiling out/cljs/spec/impl/gen.cljs
WARNING: Cannot infer target type in expression (. LazyVar -prototype) at line 16 out/cljs/spec/impl/gen.cljs
WARNING: Cannot infer target type in expression (. LazyVar -getBasis) at line 16 out/cljs/spec/impl/gen.cljs
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/clojurescript/1.9.456/clojurescript-1.9.456.jar!/clojure/string.cljs to out/clojure/string.cljs
Compiling out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s replace re-surrogate-pair "$2$1") at line 24 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. (.replace s re-surrogate-pair "$2$1") (split "")) at line 25 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. (. (.replace s re-surrogate-pair "$2$1") (split "")) (reverse)) at line 25 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. (. (. (.replace s re-surrogate-pair "$2$1") (split "")) (reverse)) (join "")) at line 25 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s replace (js/RegExp. (.-source re) "g") replacement) at line 29 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. re -source) at line 29 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s replace (js/RegExp. (gstring/regExpEscape match) "g") replacement) at line 48 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s replace match replacement) at line 64 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s toUpperCase) at line 88 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s toLowerCase) at line 93 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. cljs.core/PersistentVector -EMPTY-NODE) at line 131 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. cljs.core/PersistentVector -EMPTY-NODE) at line 132 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. (str s) split re) at line 146 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s indexOf m) at line 154 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s substring (+ index (count m))) at line 155 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s substring 0 index) at line 157 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s -length) at line 184 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s substring 0 index) at line 191 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s -length) at line 206 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s charAt index) at line 210 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s indexOf value) at line 221 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s indexOf value from-index) at line 226 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s lastIndexOf value) at line 235 out/clojure/string.cljs
WARNING: Cannot infer target type in expression (. s lastIndexOf value from-index) at line 240 out/clojure/string.cljs
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/clojurescript/1.9.456/clojurescript-1.9.456.jar!/clojure/walk.cljs to out/clojure/walk.cljs
Compiling out/clojure/walk.cljs
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/clojurescript/1.9.456/clojurescript-1.9.456.jar!/cljs/spec.cljs to out/cljs/spec.cljs
Compiling out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. Keyword -prototype) at line 126 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. Keyword -prototype) at line 126 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. Keyword -prototype) at line 126 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. Symbol -prototype) at line 126 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. Symbol -prototype) at line 126 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. Symbol -prototype) at line 126 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. x -sym) at line 309 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -prototype) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9162 -getBasis) at line 383 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -prototype) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9251 -getBasis) at line 468 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -prototype) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9266 -getBasis) at line 504 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -prototype) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9284 -getBasis) at line 548 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -prototype) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9298 -getBasis) at line 648 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -prototype) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9404 -getBasis) at line 731 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -prototype) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9422 -getBasis) at line 767 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -prototype) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9441 -getBasis) at line 835 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -prototype) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9703 -getBasis) at line 1241 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. ret -message) at line 1312 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -prototype) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9716 -getBasis) at line 1290 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -prototype) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9739 -getBasis) at line 1338 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -prototype) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/List -EMPTY) at line 2434 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. t_cljs$spec9745 -getBasis) at line 1358 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. cljs.core/PersistentVector -EMPTY-NODE) at line 1387 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. start lessThanOrEqual val) at line 1403 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. start lessThanOrEqual val) at line 1403 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. val lessThan end) at line 1404 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. start lessThanOrEqual val) at line 1407 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. start lessThanOrEqual val) at line 1407 out/cljs/spec.cljs
WARNING: Cannot infer target type in expression (. val lessThan end) at line 1408 out/cljs/spec.cljs
Compiling src/main/test/infer.cljs
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/base.js to out/goog/base.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/string/string.js to out/goog/string/string.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/object/object.js to out/goog/object/object.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/math/integer.js to out/goog/math/integer.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/string/stringbuffer.js to out/goog/string/stringbuffer.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/debug/error.js to out/goog/debug/error.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/dom/nodetype.js to out/goog/dom/nodetype.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/asserts/asserts.js to out/goog/asserts/asserts.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/array/array.js to out/goog/array/array.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/reflect/reflect.js to out/goog/reflect/reflect.js
Copying jar:file:/Users/zilence/.m2/repository/org/clojure/google-closure-library/0.0-20160609-f42b4a24/google-closure-library-0.0-20160609-f42b4a24.jar!/goog/math/long.js to out/goog/math/long.js
Copying file:/Users/zilence/code/cljs-infer/src/main/test/infer.cljs to out/test/infer.cljs
```