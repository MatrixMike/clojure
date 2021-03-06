(ns formattest.core
(:gen-class )
;;(:require clojure.pprint)
(:require   [clojure.pprint :as pp]
            [clojure.string :as cstr]
            [clojure.set    :as cset]))
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
  

 (defn midp 
[n m ]
"return half the sum of the given values"
(* (+ n m ) 0.5)
)     
 (defn makeLine [x1 y1 x2 y2 ]
 "generate a list of n co-ords between two points "
 "(x2-x1)/ (n+1)  is step    "
 "  (doseq [n "
 [(midp x1 x2)
 (midp y1 y2)]
 ;;(def Linex (seq []))
 ;;(def Liney (seq []))
 )


  
(def riders ["mike" "graeme" "pIET" " " "steve" "" "heiNZ" "23" "Colin"])

(defn uppercase-first "Returns word with first letter in upper case" 
	[word]
	(if-not (or (empty? word) (nil? word))
	(cstr/join (cons (cstr/upper-case (first word))
		(rest word)))
		word))
		
(def greeting "Hello")

;;(defn pp
;;  ([n x]
;;   (binding [pp/*print-right-margin* n]
 ;;    (-> x clojure.pprint/pprint)))
;;  ([x]
 ;;  (pp 100 x)))		
 
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
(println (format "Hello there, %s" "bob"))
(println (makeLine 2.1 17.2 5.1 13.1 ))
;;(println (format( " %3f %3f %3f %3f " (makeLine 2.1 17.2 5.1 13.1 ))))
(foo  "mjh" )
;;
(println (map #(list % %)  [ 1.1 2.1 3.1 4.1 ]))
(println (map #(list % %)  (makeLine 2.1 17.2 5.1 13.1 )))
(println "\ntest 2")
(dorun (map print [1 2 3 4 5]))
;;(dorun (map printf "%2.2f " (1.1 2.1 3.1 4.1 5.1)))
(apply (partial map println) [[1 2 3 4]])
(pp/print-table [{:a 1 :b 2 :c 3} {:b 5 :a 7 :c "dog"}])

(def myname "John Smith")
(pp/pprint myname)
(pp/pprint 'uppercase-first)
(pp/pprint '(map #(list % %)  (makeLine 2.1 17.2 5.1 13.1 )))
(apply (partial map println) ['(1 2 3 4)])
(flush)
)
