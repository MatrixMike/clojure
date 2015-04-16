;
;   needs the intersection definitions file - ATM I copy the Rich Hickey text into REPL but need to use proper command 
; to treat the .clj file like an 'include' file

(def word1 "storage")
(def word2 "capacitor")
(def word3 "electrolytic")
(def word4 "tantalum")
(def word5 "positive")
(def word6 "negative")
(def word7 "zinc")
; does odd things with word negative ... maybe a keyword

;
(defn crossw2 [word1 word2]
	(def ws1 (set word1))
	(def ws2 (set word2))
	;; test for word1 eq word2 and ignore if it is 
	
	(println (str "\n" word1 "+" word2 (clojure.set/intersection ws1 ws2)  ))
	)
(crossw2 "Mike" "Hewitt")
;

(def newwords ( seq [word1 word2 word5 word4 word3 word6 word7]))
(for [a newwords  b newwords ]    ( crossw2 a b))
;
