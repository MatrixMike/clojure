(ns stringeye.core
 (:gen-class)
;;  (:import utils.demo)
  (:import [javax.swing JPanel JFrame]
           [javax.swing SwingUtilities]
           [java.awt Dimension]
           [java.awt.Color]
           [utils.demo])
)         
; Date  13.05.2015 14:24:59
 ;; Fri 18 Mar 2016 01:17:34 AEDT 
(def upperR 400) (def lowerR 0) (def step 5)

(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
                 (doseq [j (range lowerR upperR step)] (.drawLine g j 0        0      (- upperR j)))
                 (doseq [j (range lowerR upperR step)] (.drawLine g j upperR   upperR (- upperR j)))
     ))]
    (doto panel
      (.setPreferredSize (Dimension. (. demo addvals upperR 50) (+ upperR 50))))))
 
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

(make-frame (make-panel)) ;; (System/exit 0))   
)

