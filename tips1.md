clj
(def upperR 400) (def lowerR 0) (def step 5)
 (printf "(%3d, %3d) (%3d, %3d) %n" 5 26 337 8)
(doseq [j (range lowerR  ( inc upperR)   step)] (println j "," lowerR ";"  upperR ","j))   ;;print the values 
