(defn list-xyz [xyz-map]
  (list (:x xyz-map) (:y xyz-map) (:z xyz-map)))
  
  (list-xyz {:x 1, :y 2 :z 3})
  
  (defn list-xyz [{x :x, y :y, z :z}]
  (list x y z))
  
  (defn list-xyz [{:keys [x, y, z]}]
  (list x y z))
  
  (defn vec-norm [vec3]
  (Math/sqrt (+ (* (nth vec3 0) (nth vec3 0))
		(* (nth vec3 1) (nth vec3 1))
		(* (nth vec3 2) (nth vec3 2)))))
		
		
		(defn vec-norm [[x, y, z]]
  (Math/sqrt (+ (* x x) (* y y) (* z z))))
 
;;user=> (vec-norm [1, 2, 3])

(doseq [ item '((1 2) [3 4] "D")] (prn item))

(doseq [item {:a 1 :b 2}] (prn item))

(for [item {:a 1 :b 2}] item)

;;((dotimes [i 4] (prn(str  "00" i)))  ;; errors here
;;(dotimes [i 4] (prn(str  "00" i))))

(dotimes [i 4] (prn (* i 3)))

(defn my-zipmap [keys vals]
  (loop [my-map {}
         my-keys keys
         my-vals vals]
    (if (and (seq my-keys) (seq my-vals))
      (recur (assoc my-map (first my-keys) (first my-vals))
             (rest my-keys)
             (rest my-vals))
      my-map)))
 
(println (my-zipmap [:a :b :c] [1 2 3]))

(def x (atom 0))

 (swap! x + 1)
 
 
 
;;  @x
  
  (def p #{1,2,3})
  
  (def a #{1,2,3,4})
(def b #{2,3,5})

 (clojure.set/union a b)  ;; not in 1.4 12.04.2015 05:00:46
 
 (clojure.set/intersection a b)
  (clojure.set/difference a b)
  
 (repeat 10 "a")
 
 
 
 (take 15 random-ints) ; first 10 are the same, 5 new ints generated
 
 ; to avoid a global list, you can do this:
(defn make-calls [n func]
  (take n (repeatedly func)))
  
  ; no fear of keeping huge lists in memory this time (unless you hold onto them, of course)
 (make-calls 5 #(rand-int 100))
 
 (concat [1 3] [3 4 3] [3 3])
 
 (def x (cycle [1 2 3]))
 (take 12 x)
 
 
 
 (def rands (repeatedly rand))
 (take 4 rands)
 
 (def just4 (repeat 4))
 (take 5 just4)
 
 
 
  (def integers (range))
 (take 10 integers)
 
  ;; Generates (x (inc  x) (inc (inc  x)) ...)
 (def integers (iterate inc 0))
 (take 4 integers)
 ;; ⇒ (0 1 2 3)
 
  (def newton (iterate (fn[x] (/ (+ x (/ 2.0 x)) 2)) 2))
 (take 5 newton)
 ;; ⇒ (2 1.5 1.4166666666666665 1.4142156862745097 1.4142135623746899)
 
 (defn argcount
   ([] 0)                                ; Zero arguments
   ([x] 1)                               ; One argument
   ([&  args] (count args)))    ; List of arguments
 
(argcount)
;; ⇒ 0

(defn argcount
   ([] 0)                                ; Zero arguments
   ([x] 1)                               ; One argument
   ([&  args] (count args)))    ; List of arguments
 
(argcount)
;; ⇒ 0
(argcount "dog")
;; ⇒ 1
(argcount "cat" 1 3 4)
;; ⇒ 4

(defmulti g (fn[& arglist] (count arglist)))
(defmethod g 0 [& arglist] "No arguments.")
(defmethod g 1 [& arglist] "One argument.")
(defmethod g 2 [& arglist]  "Two arguments.")
(defmethod g :default [& arglist] "More than two arguments.")
 
(g)                    ; ⇒ "No arguments."
(g 1)                  ; ⇒ "One argument."
(g 2)                  ; ⇒ "One argument."
(g 3 4)                ; ⇒ "Two arguments."
(g "cart" 1 [2 3 ])    ; ⇒ "More than two arguments."

(comment Define f to be a multi-method function and dispatch using class of argument)
(defmulti f class)
 
(comment Use this definition for f if the class of the argument x is a long)
(defmethod f Long [x] "Argument is a long")
 
(comment Use this definition for f if the class of the argument x is a double)
(defmethod f Double [x] "Argument is a double")
 
(comment Use this definition for f for all other argument types )
(defmethod f :default [x] "Argument is not a number")
 
(f 3)               ; ⇒ "Argument is a long"
(f 3.4)             ; ⇒ "Argument is a double"
(f "string")        ; ⇒ "Argument is not a number"

(comment Define g to be a multi-method function which dispatches on the class of its arguments)
(defmulti g (fn[x,y] [(class x) (class y )]))
 
(comment Use this definition for g if class of first argument is a long and class of second argument is a long)
(defmethod g [Long,Long]  [x,y] "Both arguments are longs")
 
(comment Use this definition for g if class of first argument is long and class of second argument is double)
(defmethod g [Long,Double] [x,y] "First argument is a long and second argument is a double")
 
(comment Use this definition for g as the default )
(defmethod g :default [x,y] "All other cases")
 
(g 3 2)         ; ⇒ "Both arguments are longs"
(g 3 4.3)       ; ⇒ "First argument is a long and second argument is a double"
(g 4.3 4.3)     ; ⇒ "All other cases"

(comment Create multi method h that dispatches on the value of the argument)
(defmulti h (fn[x] x))
 
(comment Use this definition for h if argument is 4)
(defmethod h 4 [x] "argument is 4")
 
(comment Use this definition for other values of h)
(defmethod h :default [x] "argument is not 4")
 
(h 4)          ; ⇒ "argument is 4"
(h 3)          ; ⇒ "argument is not 4"
(h [3 34])     ; ⇒ "argument is not 4"
 
(comment Create multi method h that dispatches on the value of the argument being in an interval)
(defmulti h (fn [x] (<= 4 x 10)))
 
(comment Use this definition for h if argument is between 4 and 10 )
(defmethod h true [x] "argument is between 4 and 10")
 
(comment Use this definition for other values of h)
(defmethod h :default [x] "argument is not between 4 and 10")
 
(h 1)        ; ⇒ "argument is not between 4 and 10"
(h 4)        ; ⇒ "argument is between 4 and 10"
(h 10)       ; ⇒ "argument is between 4 and 10"
(h 11)       ; ⇒ "argument is not between 4 and 10"


(new JFrame)
 
;; or
(JFrame.)

 (Math/cos 3)
 (. Math cos 3)
 
 ;;method name first
(.getContentPane frame)
 
;;object first
(. frame getContentPane)

public class OkCancelDialog {
  //Inner class
  public static enum State {
    OK, CANCEL;
  };
}

(println OkCancelDialog$State/OK)
(println OkCancelDialog$State/CANCEL)

;; equivalent to frame.getContentPane().getSize()
(.. frame getContentPane getSize)


(ns drawing-demo
  (:import [javax.swing JPanel JFrame]
           [java.awt Dimension]))
 
(defn make-panel []
  (let [panel (proxy [JPanel] []
                (paintComponent [g]
                  (.drawLine g 0 0 100 100)))]
    (doto panel
      (.setPreferredSize (Dimension. 400 400)))))
 
(defn make-frame [panel]
  (doto (new JFrame)
    (.add panel)
    .pack
    .show))
 
(make-frame (make-panel))



(import '(cljext.swing DelegatingPanel IPainter))

(str "A" "B" "C")

(apply str ["A" "B" "C"])
;; ⇒ "ABC"
(apply str ["/usr/include" \/ "stdio.h"])
;; ⇒ "/usr/include/stdio.h"
 
 (apply str (interpose \: ["A" "B" "C"]))
;; ⇒ "A:B:C"
 
(apply str 
  (interpose \:
    ["/usr/local/sbin" "/usr/local/bin" "/usr/sbin" "/usr/bin" "/sbin" "/bin"]))
;; ⇒ "/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"

(apply str (interpose \+ ["A" "B" "C"]))  ;; mike

(re-seq #"\w+" "to be or not to be")

(apply str (reverse "I am cold"))
;; ⇒ "dloc ma I"

(str 3)             ; ⇒ "3"
(str 3.0)           ; ⇒ "3.0"
(str 'a)            ; ⇒ "a"
(str '(1 2))        ; ⇒ "(1 2)"
(str {:a 1 :b 2})   ; ⇒ "{:a 1, :b 2}"

 (System/getProperty "user.dir") 
 
  (str (last(rest (re-seq #"\w+" "to be or not to be"))) "3")
  
  (slurp "somefile.txt")
  
  (spit "output.txt" "some output text")
  (spit "output.txt" "more text with spit append" :append true)
  
  (spit  "output2.txt" (str (last(rest (re-seq #"\w+" "to be or not to be"))) "3")



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
 
(spit "cube1.txt" (dotimes [i 4] (prn(str "set " "00" i  " red;"))))

 
 
 
 
 
