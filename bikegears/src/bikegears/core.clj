(ns bikegears.core
(:gen-class )
(:require   [clojure.string :as cstr]
            [clojure.set :as cset]))
            
;;(defn foo
;;  "I don't do a whole lot."
 ;; [x]
 ;; (println x "Hello, World!"))
(def fgear (seq [22.0 32.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12])) 
 (doseq  [n (range  3 010 2 )]    (sort (for [f fgear r rgear ] (/ f r))  ) ;;  now a sorted list 22/2/2016
 (println n)
 )
 
 
(defn -main [& args]
(println "test 1")
)