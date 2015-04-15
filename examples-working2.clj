(for [i (range 10)] (* i i ))
;; Sun Apr 12 21:16:54 EST 2015 


(for [i (range 4)]  (str "set " "00"i   " red ;" ))     

(for [i (range 4)]  (spit  "cube2.txt"  (str  "set " i"00" " red; \n"):append true))

(for [i (range 10)] (* i i ))
;; Sun Apr 12 21:16:54 EST 2015 


(for [i (range 4)]  (str "set " "00"i   " red ;" ))       

(for [i (range 4)]  (spit  "cube2.txt"  (str  "set " i"00" " red; \n"):append true))

(try (/ 1 0)
            (catch Exception e (prn "in catch"))
            (finally (prn "in finally")))
            
 (def al (doto (java.util.ArrayList.) (.add 11) (.add 3) (.add 7)))
;;  al
 (java.util.Collections/sort al)
al


 (dorun (for [i (range 0 20 3)]
          (println i)))

(Integer/toBinaryString 10)
;;"1010"
(Integer/toBinaryString 10)
;;"1010"
 ;; ⇒ "1010"
 (Integer/toHexString 10)
;;"a"
 ;; ⇒ "a"
 (Integer/toOctalString 10)

(map first [[1 2 3] "Test" (list 'hi 'bye)])


            
            
