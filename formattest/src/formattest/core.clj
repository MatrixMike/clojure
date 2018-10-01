(ns formattest.core
(:gen-class )
(:require   [clojure.string :as cstr]
            [clojure.set    :as cset]))
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
  

(defn midp 
[n m ]

(* (+ n m ) 0.5)
)


  
(def riders ["mike" "graeme" "pIET" " " "steve" "" "heiNZ" "23" "Colin"])

(defn uppercase-first "Returns word with first letter in upper case" 
	[word]
	(if-not (or (empty? word) (nil? word))
	(cstr/join (cons (cstr/upper-case (first word))
		(rest word)))
		word))
		
(def greeting "Hello")
		
(defn hello 
	"Returns hello string" 
	[who]
	(str greeting  " " who "!" ))
  
(defn -main [& args]
(println "\ntest 1")
;; why does (format ... ) not produce anything ?
(println (format "%.3f" 2.0))
;;(printf "midpoint of %f and %f is %2.3f%n"  2 9 (midp 2 9))
(printf "midpoint of  and  is %2.3f%n"   (midp 2 9))
(printf "%2.2f%n" 2.0)
(printf "1 + 2 is %s%n" 3)
;;(hello (cstr/join ", " (map uppercase-first  (reverse (sort riders))))))
(println  (map uppercase-first  (reverse (sort riders))) )
;;https://stackoverflow.com/questions/13224733/mapcat-using-map-and-concat
;;(println  (map #(list % %) [1 2 3]))
(println  (map #(list % %) [1 2 3]))
(format "Hello there, %s" "bob")
(foo  "mjh" )
(println "\ntest 2")
(flush)
)
