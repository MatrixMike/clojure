(ns colourtest.core
(:gen-class)
)
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
 (def m 3) 
(defn colour [x]
;; takes a collection of values a.o.t. single value
(map #(condp = %
  1 :red
  2 :green
  3 :blue
    :dunno)     (map inc (map #(rem % m) x)))
)



(defn -main [& args] 

(printf "test %3.3f\n" 18.7856)

;;( printf  "%3.3f" (sinfunc1 0.5)  )
(println (colour (range 1 15)))
)
