(ns newtest2.core
(:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
  
;;(ns clojure.examples.hello
;;    (:gen-class))

(defn -main
  [greetee]
  (println (str "Hello " greetee "!")))
