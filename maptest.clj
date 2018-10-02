;;   document why this works 
;; what shortcuts are taking place

(defn midp 
[n m ]
"return half the sum of the given values"
(* (+ n m ) 0.5)
)     

(defn squ1 [x n]
(* x x))

(defn squ [x]
(* x x))

(defn ft [x]
(format " %3.2f" (* x x)))  ;; (format " %3.2f" squ(x)))

(def strt 6.0)
(def stop 11.0)
;;(def 
(println (map inc [1 2 3 4 5]))
(println (map squ [1 2 3 4 5]))
(println (map ft [1.1 2.1 3.1 4.1 5.1] ))
(println (map ft (range 1.1 15.1  )))
(println "line")
(println (map ft (range strt stop (* (- stop strt ) 0.05 ))))
(println (ft 6.1))
(println (/ (- stop strt ) 20.0 ))
