(ns build
  (:require [clojure.java.io :as io]
            [cljs.build.api :as b]
            [cljs.analyzer :as ana]))

(defn once []
  (binding [ana/*cljs-warnings*
            (assoc ana/*cljs-warnings*
              :infer-warning true)]

    (b/build (b/inputs "src/main")
      {:main 'test/infer
       :output-to "out/main.js"
       :output-dir "out"
       :verbose true}))

  :done)
