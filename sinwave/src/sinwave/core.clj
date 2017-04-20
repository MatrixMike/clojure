(ns sinwave.core
  (:gen-class)
;;  19.03.2016 20:59:01

  (:import [javax.swing JPanel JFrame]
           [java.awt Dimension])
   )
         
; Date  13.05.2015 14:24:59
 
(def sides 7)
(def theta (/ 360 sides))
(def halfangle (/ theta 2))

(defn sinfunc [x]( Math/sin ( (+ (* theta (. Math PI) x) halfangle  ) ) ) )
(defn cosfunc [x](* theta (. Math PI) x))
 
(def upperR 1) 
(def lowerR 0) 
(def step 0.2)

(defn make-panel []
  (let [panel (proxy [JPanel] []
          (paintComponent [g]
          (doseq [j (range lowerR upperR step)] (.drawLine g j  (sinfunc   j )  0      (cosfunc   j )))
                ; (doseq [j (range lowerR upperR step)] (.drawLine g j upperR   upperR (- upperR j)))
     ))]
    (doto panel
      (.setPreferredSize (Dimension. 400 400 )))))
 
  
 ;;(def j 0.5)
 ;;  (sinfunc   j   )
 ;  ( Math/sin j)
 
(defn make-frame [panel]
  (doto   (new JFrame "Sine Wave") ;; (JFrame.) ;;   give a title to the Window
  (.add panel)
   .pack
                              ;; add close command here
                              ;; (.setBackground (. Color YELLOW))
                              ;;  f.getContentPane().setBackground(new Color(107, 106, 104));
                             ;;  ( .getContentPane.setBackground     YELLOW) )
  (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
   .show))

(defn -main [& args] 
  (make-frame (make-panel)) 
)
 
