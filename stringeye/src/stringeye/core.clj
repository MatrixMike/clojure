(ns stringeye.core
(:gen-class)


  (:import [javax.swing JPanel JFrame]
           [java.awt Dimension])
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
      (.setPreferredSize (Dimension. (+ upperR 50) (+ upperR 50))))))
 
(defn make-frame [panel]
  (doto (JFrame.)        ;;was (new JFrame)
    (.add panel)
    .pack
;; add close command here
 (.setDefaultCloseOperation JFrame/EXIT_ON_CLOSE)
    .show))
 
 
           

(defn -main [& args] 

(make-frame (make-panel)) ;; (System/exit 0))   
)

