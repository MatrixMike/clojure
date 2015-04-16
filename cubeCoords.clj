;; 16 April 2015
;; this is quite simple clojure code to generate tty input to the Freetronics Arduino Cube (4*4*4)
;; as a demo, to a mature student, about repeated commands, 3D co-ordinates etc
;; Mike Hewitt

;; note:  the append command needs to have an 'open' command before it will work
;; copy this into clojure REPL - it will generate a file of name 'cubefile' 
;; much can be done to tidy this but as it works it gets saved to the great git god 





(def cubefile "cube2.txt")
(def colour1 "red")
(def colour2 " blue")


(spit cubefile "all black;\n")

;(dotimes [i 4] (spit "cube2.txt" (str "set " "00"i " red;\n") :append true )  )
;

(dotimes [i 4] (spit cubefile (str "set " i"00" " red;\n") 		:append true )  )
(dotimes [i 4] (spit "cube2.txt" (str "set " "0"i"0"      " red;\n") 	:append true )  )
(dotimes [i 4] (spit "cube2.txt" (str "set " "3"i"0"      " red;\n") 	:append true )  )
(dotimes [i 4] (spit "cube2.txt" (str "set " i"30" " red;\n") 		:append true )  )
;;;;;
;(dotimes [i 4] (spit "cube2.txt" (str "set " "00"i " red;\n") :append true )  )
;

(dotimes [i 4] (spit cubefile (str "set " i"03"  colour2 ";\n") :append true )  )
;
(dotimes [i 4] (spit "cube2.txt" (str "set " "0"i"3"  colour2 ";\n") :append true )  )
;
(dotimes [i 4] (spit "cube2.txt" (str "set " "3"i"3"  colour2 ";\n") :append true )  )
;
(dotimes [i 4] (spit "cube2.txt" (str "set " i"33"  colour2 ";\n") :append true )  )
;
