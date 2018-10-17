(def m 3)

(print   (map inc ( map #(mod % m) (range 1 12))  ))
(println)
(print (map #(mod % 4) (range 1 10)))
(println)
(print (map #(rem % 4) (range 1 10)))
(println)
(print (map #(quot % 4) (range 1 10)))

(def months ["jan" "feb" "mar"])

(def temps [5 7 12])
(defn squ [x]
(* x x))

(defn colour [x]
;; takes a collection of values a.o.t. single value
(map #(condp = %
  1 :red
  2 :green
  3 :blue
    :dunno)     (map inc (map #(rem % m) x)))
)

(defn unify
  [month temp]
  {:month month
   :temp temp})
(println)
(print (map unify months temps))
(println)
(def x 2)
(print(condp = x 1 :red 2 :green 3 :blue :dunno))
(println)
    (print  (map #(condp = %
  1 :red
  2 :green
  3 :blue
    :dunno)     (map inc (map #(mod % m) (range 1 12)))))
(println)
;;(print (map #(condp = x 1 :red 2 :green 3 :blue :dunno)    (map #(mod % 4) (range 1 10))))
    (print  (map #(condp = %
  1 :red
  2 :green
  3 :blue
    :dunno)     (map inc (map #(quot % m) (range 1 12)))))
(println)
(print (colour [ 5 ]))   ;; was (colour 3 ) ;; note collection with one value
(println)
(println (colour (range 1 15)))
(println) 
