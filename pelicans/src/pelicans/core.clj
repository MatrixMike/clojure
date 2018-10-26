(ns pelicans.core
(:gen-class )
(:require   [clojure.string :as cstr]
            [clojure.set :as cset]))

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
				
(defn hello-riders 
	"Returns greetings to all the riders."
	[]
	(hello (cstr/join ", " (map uppercase-first  (reverse (sort riders))))))
				
(hello-riders)

;; ( (first greeting) (last greeting))
;; (clojure.string/lower-case "MiXeD cAsE")
;; (cstr/join ( cons (first greeting) (last greeting)))


(defn -main [& args]
(println (hello-riders)) 
(println (cstr/lower-case "MiXeD cAsE"))
(println (cstr/lower-case riders))
)
