(for [i (range 10)] (* i i ))
;; Sun Apr 12 21:16:54 EST 2015 


(for [i (range 4)]  (str "set " "00"i   " red ;" ))     

(for [i (range 4)]  (spit  "cube2.txt"  (str  "set " i"00" " red; \n"):append true))
