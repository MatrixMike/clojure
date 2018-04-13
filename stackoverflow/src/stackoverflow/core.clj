(ns stackoverflow.core
 (:gen-class)
 )
(defn foo
  "I don't do a whole lot."
  [x]   ;; one parameter
  (println x "Hello, World!"))

(defn -main [& args] 

(foo "mjh") ;; (System/exit 0))   
)
