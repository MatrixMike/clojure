;;
(ns drawing-demo
  (:import [javax.swing JPanel JFrame]
           [java.awt Dimension]
           [java.awt Color]
))
; 15.10.2018 10:44:37          
; Date  13.05.2015 14:24:59
 
(def upperR 400) (def lowerR 0) (def step 5)

(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
                 (doto g       (.setColor Color/BLUE)) 
                 (doseq [j (range lowerR upperR step)] (.drawLine g j lowerR   lowerR (- upperR j)))
                 (doto g       (.setColor Color/GREEN)) 
                 (doseq [j (range lowerR upperR step)] (.drawLine g j upperR   upperR (- upperR j)))
                 (doto g       (.setColor Color/RED)) 
                 (doseq [j (range lowerR upperR step)] (.drawLine g lowerR   j   j       upperR ))
                 (doto g       (.setColor Color/BLACK)) 
                 (doseq [j (range lowerR ( inc upperR)  step)] (.drawLine g j  lowerR   upperR j))
           (doseq [j (range lowerR  ( inc upperR)   step)] (printf "(%3d, %3d) (%3d, %3d) %n" j lowerR upperR j ))   ;;print the values
           (println)  (comment to flush the printf)
     ))]
    (doto panel
      (.setPreferredSize (Dimension. (+ upperR 50) (+ upperR 50))))))
 
(defn make-frame [panel]
  (doto  (new JFrame "StringEye")        ;;was (new JFrame)
    (.add panel)
    .pack
    (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
    .show))
 
(make-frame (make-panel)) ;; (System/exit 0))    
             
 
