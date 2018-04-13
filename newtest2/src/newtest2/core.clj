(ns newtest2.core
(:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
  
;;(ns clojure.examples.hello
;;    (:gen-class))

(defn fib [n]
  (if (<= n 1)
    n
    (+ (fib (dec n)) (fib (- n 2)))))

(defn -main
  [greetee]
  (println (str "Hello " greetee "!"))
  (println (fib 5))       ;; try w/out () around fib 5 
  )
