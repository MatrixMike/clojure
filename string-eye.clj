;;
(ns drawing-demo
  (:import [javax.swing JPanel JFrame]
           [java.awt Dimension]))
           
; Date  13.05.2015 14:24:59
 
(def upperR 400) (def lowerR 0) (def step 5)

(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
                 (doseq [j (range lowerR upperR step)] (.drawLine g j 0        0      (- upperR j)))
                 (doseq [j (range lowerR upperR step)] (.drawLine g j upperR   upperR (- upperR j)))
     ))]
    (doto panel
      (.setPreferredSize (Dimension. (+ upperR 50) (+ upperR 50))))))
 
(defn make-frame [panel]
  (doto (JFrame.)        ;;was (new JFrame)
    (.add panel)
    .pack
    .show))
 
(make-frame (make-panel) ; (System/exit 0))    
             )
 
