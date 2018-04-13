(let [x 2] (+ x 8) )

(defn lp [p]  "comment for lp - parameter p is not used"
(loop [i 0]
(when (< i 5 )
(println i )
(recur (inc i ))))
)

