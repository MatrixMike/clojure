(ns tutorial.core
(:require   [clojure.string :as cstr]
            [clojure.set :as cset]))

(def riders ["mike" "graeme" "piet" " " "steve" "" "heinz" "23" "Colin"])

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
				
(defn hello-riders 
	"Returns greetings to all the riders."
	[]
	(hello (cstr/join ", " (map uppercase-first  (reverse (sort riders))))))
				
(hello-riders)

;; ( (first greeting) (last greeting))

;; (cstr/join ( cons (first greeting) (last greeting)))

(println (hello-riders))
