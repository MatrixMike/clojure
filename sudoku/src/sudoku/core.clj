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

(def sn1 "23") (def sn2 "234") (def sn3 "345")
;;(def zone1 "1") (def zone2 "2") (def zone3 "3")
 (def tobechecked (seq [sn1 sn2 sn3]))

(defn poss3d [] (clojure.set/intersection 
     (clojure.set/difference (set sword) (set sn1)) 
     (clojure.set/difference (set sword) (set sn2)) 
     (clojure.set/difference (set sword) (set sn3))))
;; usage for poss3d -> setup sn1, sn2, sn3 like (def sn1 "19753") then invoke function with (poss3d)

(defn poss3da [zone1a zone2a zone3a] 
(clojure.set/intersection 
     (clojure.set/difference (set sword) (set zone1a)) 
     (clojure.set/difference (set sword) (set zone2a)) 
     (clojure.set/difference (set sword) (set zone3a))))
;; usage for poss3da -> setup sn1, sn2, sn3 like (def sn1 "19753") then invoke function with (poss3d)


(defn -main [zone1 zone2 zone3]   ;; one way to force 3 strings as input
(def zonetobechecked (seq [zone1 zone2 zone3]))


;;(doseq [arg *command-line-args*]
	;;  (def ws1 (set args))
	(println poss3da zone1 zone2 zone3)
	;;(printf "arg='%s'    \n" arg)
	;; (println ws1)
;;		 )

;;(println tobechecked)
;;(println (str "output from poss3d  :" (poss3d)))
(println (str "output from poss3da  :" (poss3da zone1 zone2 zone3)))
(println "\u03bb")  ;; lambda
(println "\u03a9")  ;; Omega resistance ;; notice Gnome Character map based on Unicode Character Database 6.3.0
(println "\u01F030")  ;; dominos

(println zonetobechecked )
 (doseq [z zonetobechecked ]
   (println(clojure.set/intersection (clojure.set/difference (set sword) (set z) ) ))
   ;; repeated diff working but need different construct to 'save' the intermediate o/p 
   ;;for use as i/p to intersection
   ;; currently generates one line per CL parameter
    )  

;;(println (doseq [z zonetobechecked ]    ))  ;; outputs nil {doseq inside println}
;; (doseq   [z zonetobechecked ] (println z))
	)

;; DOSEQ: Repeatedly executes body (presumably for side-effects) with
;; bindings and filtering as provided by "for".  Does not retain
;; the head of the sequence. Returns nil.
;;; The 'returns nil' helps to explain why println outside doseq gives nil -> examples show 
;;; other way around.
;;; https://clojuredocs.org/clojure.core/doseq
