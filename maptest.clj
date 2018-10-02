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


(println (map inc [1 2 3 4 5]))
(println (map squ [1 2 3 4 5]))
(println (map ft [1.1 2.1 3.1 4.1 5.1] ))
(println (map ft (range 1.1 15.1  )))
(print (ft 6.1))

