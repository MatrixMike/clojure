;
;   needs the intersection definitions file - ATM I copy the Rich Hickey text into REPL but need to use proper command 
; to treat the .clj file like an 'include' file

;; http://clojure.org/reference/compilation

;; 
(ns sudoku.core
 (:gen-class )

 ;; (:use [clojure.string ])
(:use [clojure.set ])
  
  )
  

(def word1 "storage")
(def word2 "capacitor")
(def word3 "electrolytic")
(def word4 "tantalum")
(def word5 "positive")
(def word6 "negative")
(def word7 "zinc")
(def sword "987654321")		;; added for sudoku
(def sword1 "9278")		;; added for sudoku

; does odd things with word negative ... maybe a keyword

;
(defn crossw2 [word1 word2]
	(def ws1 (set word1))
	(def ws2 (set word2))
	;; test for word1 eq word2 and ignore if it is 
	
	(println (str "\n" word1 "+" word2 (clojure.set/intersection ws1 ws2)  ))
	)
(defn crossdiff [word1 word2]
	(def ws1 (set word1))
	(def ws2 (set word2))
	;; test for word1 eq word2 and ignore if it is 
	
	(println (str "\n" word1 "+" word2 (clojure.set/difference ws1 ws2)  ))
	)

(defn crossdiff3 [word1 word2 word3]	;; difference (opposite) for 3 sudoku areas
	(def ws1 (set word1))
	(def ws2 (set word2))
	(def ws3 (set word3))
	;; test for word1 eq word2 and ignore if it is 
	
	(println (str "\n" word1 "+" word2 (clojure.set/difference sword ws1)  ))  ;; do for each of 3 ip
	)



;; (crossw2 "Mike" "Hewitt")
;

(def newwords ( seq [word1 word2 word5 word4 word3 word6 word7]))
(for [a newwords  b newwords ]    ( crossw2 a b))
;


;; (clojure.set/intersection (clojure.set/difference (set sword) (set sn1)) (clojure.set/difference (set sword) (set sn2)) (clojure.set/difference (set sword) (set sn3)))

(def sn1 "123") (def sn2 "234") (def sn3 "345")
 (def tobechecked (seq [sn1 sn2 sn3]))

(defn poss3d [] (clojure.set/intersection 
     (clojure.set/difference (set sword) (set sn1)) 
     (clojure.set/difference (set sword) (set sn2)) 
     (clojure.set/difference (set sword) (set sn3))))
;; usage for poss3d -> setup sn1, sn2, sn3 like (def sn1 "19753") then invoke function with (poss3d)

(defn -main [& args]

;;(doseq [arg *command-line-args*]
	(def ws1 (set args))

	;;(printf "arg='%s'    \n" arg)
	(println ws1)
;;		 )




(println tobechecked)
(println (poss3d))
(println "\u03bb")  ;; lambda
(println "\u03a9")  ;; Omega resistance ;; notice Gnome Character map based on Unicode Character Database 6.3.0
	)


