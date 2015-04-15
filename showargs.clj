(ns com.demo.showargs)
;; 15.04.2015
;; from https://clojuredocs.org/clojure.core/*command-line-args*
;;
;; java -classpath clojure-1.6.0.jar clojure.main showargs.clj  arg1 2 "whitespace in most command shells if you quote"  112 "another arg"  "2"



(doseq [arg *command-line-args*]
	(def ws1 (set arg))

	(printf "arg='%s'    \n" arg)
	(println ws1)
		 )
  
(printf "test %3.3f\n" 18.7856)

(if (= "2" (second *command-line-args*))
  (println "\n\nSecond arg is string 2, not number 2. Mike mod."))
