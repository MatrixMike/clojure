;; clojure program to generate all possible values of gear
;; ratios for Mike's white bike  (ex PB)


(def digits (seq [1 2 3]))
(for [x1 digits x2 digits] (* x1 x2))
;


;15.04.2015
(def fgear (seq [22.0 32.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12]))

;; (for [fgear digits1 rgear digits2] (/ fgear rgear))    ;; missing digits2 definition
;
; now to sort the created list

;; next version 
(for [x ['a 'b 'c] 
      y [1 2 3]]
  [x y])
  
  ; https://clojuredocs.org/clojure.core/for
  
(for [x [22.0 32.0 42.0] 
      y [26 23 21 19 17 15 13 12]]
  [x y])
  
    ;; maybe we can feed the sequence into something and divide 
    ;; one value by the other;15.04.2015
(def fgear (seq [22.0 32.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12]))

;;(for [fgear digits1 rgear digits2] (/ fgear rgear))
;

 ;15.04.2015
(def fgear (seq [32.0 22.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12]))

(for [f fgear r rgear ] (/ f r))  ;; creates unsorted output

;; (doseq n     (sort (for [f fgear r rgear ] (/ f r))  ) ;;  now a sorted list 22/2/2016
;; (println n)
;; )
 
 
;;
  (println "nearly")
  (println (str   "\n" (sort (for [f fgear r rgear ] (/ f r)))))  ;; creates sorted output  ;; 27/2/2016
;; really want each item in list to be on separate line  
