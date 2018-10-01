(ns stringeye.core
 (:gen-class)
;;  (:import utils.demo)
  (:import [javax.swing JPanel JFrame]
           [javax.swing SwingUtilities]
           [java.awt Dimension]
           [java.awt Color]
           [utils.demo])
)         
; Date  13.05.2015 14:24:59
 ;; Fri 18 Mar 2016 01:17:34 AEDT 
 ;;01.10.2018 23:17:07
(def upperR 400) 
(def lowerR 0) 
(def step 5)
(comment (def mjhTest (. demo twice 200)))

;; Graphics: drawLine(int x1, int y1, int x2, int y2)
;; https://docstore.mik.ua/orelly/java-ent/jfc/ch04_03.htm
;; https://docs.oracle.com/javase/7/docs/api/java/awt/geom/AffineTransform.html

(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
                          (doto g       (.setColor Color/BLUE)) 
                 (doseq [j (range lowerR upperR step)] (.drawLine g j 0        0      (- upperR j)))
                           (doto g       (.setColor Color/RED)) 
                 (doseq [j (range lowerR upperR step)] (.drawLine g j upperR   upperR (- upperR j)))
                          (doto g       (.setColor Color/GREEN)) 
                 (doseq [j (range lowerR upperR step)] (.drawLine g  lowerR j  upperR (- upperR j)))
                 (doseq [j (range lowerR upperR step)] (.drawLine g  lowerR j  upperR (- lowerR j)))
     ))]
    (doto panel
      (.setPreferredSize (Dimension. (+ upperR 50) (+ upperR 50))))))   ;; 
 
 (defn midp 
[n m ]
"return half the sum of the given values"
(* (+ n m ) 0.5)
)     
 (defn makeLine [x1 y1 x2 y2 ]
 "generate a list of n co-ords between two points "
 "(x2-x1)/ (n+1)  is step    "
 "  (doseq [n "
 [(midp x1 x2)
 (midp y1 y2)]
 ;;(def Linex (seq []))
 ;;(def Liney (seq []))
 )
 
 
(defn make-frame [panel]
  (doto   (new JFrame "StringEye") ;; (JFrame.) ;;   give a title to the Window
  (.add panel)
   .pack
                              ;; add close command here
                              ;; (.setBackground (. Color YELLOW))
                              ;;  f.getContentPane().setBackground(new Color(107, 106, 104));
                             ;;  ( .getContentPane.setBackground     YELLOW) )
  (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
   .show))
 
(defn -main [& args] 
(println (makeLine 2 3 10 11 ))
(make-frame (make-panel)) ;; (System/exit 0))   

)

