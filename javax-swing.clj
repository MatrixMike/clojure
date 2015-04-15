;;
(ns drawing-demo
  (:import [javax.swing JPanel JFrame]
           [java.awt Dimension]))
 
(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
                  (.drawLine g 0 0   100 100)
                  (.drawLine g 0 100 100 100)
                  (.drawLine g 100 0   100 100)
                  (.drawLine g 100 0   0 100) 
                 ;; (.drawtext "Mike")  
                  ))]
    (doto panel
      (.setPreferredSize (Dimension. 400 400)))))
 
(defn make-frame [panel]
  (doto (JFrame.)        ;;was (new JFrame)
    (.add panel)
    .pack
    .show))
 
(make-frame (make-panel))
 
