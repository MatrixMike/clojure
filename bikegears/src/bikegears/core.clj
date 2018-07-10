(ns bikegears.core
(:gen-class )
(:require   [clojure.string :as cstr]
            [clojure.set    :as cset]))

;;(defn foo
;;  "I don't do a whole lot."
 ;; [x]
 ;; (println x "Hello, World!"))

(def fgear (seq [22.0 32.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12]))

(def tam1fgear (seq [38.0 28.0 48.0]))
(def tam1rgear (seq [24 28 21 18 16 14 12]))


 ;;(doseq  [n (range  3 010 2 )]    (sort (for [f fgear r rgear ] (/ f r))  ) ;;  now a sorted list 22/2/2016
 (print "%3.3f v" [(sort (for [f fgear r rgear ] (/ f r))  )]
 )
(println "\nafter a bike\n")

 (print "%3.3f v" [(sort (for [f tam1fgear r tam1rgear ] (/ f r))  )]
 )
(println "\nafter a bike\n")

(defn -main [& args]
(println "\ntest 1\n")

 
(def fgear (seq [22.0, 32.0, 42.0]))
;;(def rgear (seq [26 23 21 19 17 15 13 12])) 
(def rgear (seq [26, 23, 21, 19, 17, 15, 13, 12]))
 ;;(doseq  [n (range  3 010 2 )]    (sort (for [f fgear r rgear ] (/ f r))  ) ;;  now a sorted list 22/2/2016
 (println "%3.3f v" [(sort (for [f fgear r rgear ] (/ f r))  )])
 (printf "1 + 2 is %s%n" 3)
 
;;(defn -main [& args]
;;(printf "1 + 2 is %s%n" 3)

)
