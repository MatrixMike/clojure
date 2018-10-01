(ns formattest.core
(:gen-class )
(:require   [clojure.string :as cstr]
            [clojure.set    :as cset]))
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
  
(defn -main [& args]
(println "\ntest 1\n")
(format "%.3f" 2.0)
(printf "1 + 2 is %s%n" 3)
(format "Hello there, %s" "bob")
(println "\ntest 2\n")
)
