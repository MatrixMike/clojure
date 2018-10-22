(map #(printf "%n %2.2f " %) (sort (range 0.1 (- 1.0 0.6) (- 0.2 0.1))))

(def fgear (seq [32.0 22.0 42.0]))
(def rgear (seq [26 23 21 19 17 15 13 12]))

 (defn func1 [x] (+ x 5 (* x x )))
(comment (map #(printf "%n %2.3f " %) (sort (for [f fgear r rgear ] (/ f r)))))
(map #(printf "%n %2.3f " %)(take 15 (map #(func1 %)     (range  (- 1.001 5.0) 7.0 0.5))))

(println (map #(printf "%n %2.3f " %)(take 15 (map #(func1 %)     (range  (- 1.001 5.0) 7.0 0.5)))))
