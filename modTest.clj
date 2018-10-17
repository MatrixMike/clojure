(print (map #(mod % 4) (range 1 10)))
(println)
(print (map #(rem % 4) (range 1 10)))
(println)
(print (map #(quot % 4) (range 1 10)))

(def months ["jan" "feb" "mar"])

(def temps [5 7 12])

(defn unify
  [month temp]
  {:month month
   :temp temp})
(println)
(print (map unify months temps))
(println)
(def x 20)
(print(condp = x
  1 :red
  2 :green
  3 :blue
  :dunno))
