;; 24 April 2015
;; mod to read real System property
;; (str "Hello" User)
;; 24 April 2015
;; mod to read real System property
;; (str "Hello" User)
;; 26.04.2015 22:35:15

(defn now [] (new java.util.Date))


;; this can be executed from the command line    clojure javax-clojure2.clj  
(def prop8 "os.arch") 	;;Operating system architecture
(def prop9 "os.name") 	;;Operating system name

(def User "mikeh")
(def UH "user.home")
(def UN "user.name")
(def ppos "os.version") 
(def prop6 "java.version")

(def userN (System/getProperty UN))
(def userH (System/getProperty UH))
(def p8 (System/getProperty prop8))
(def p9 (System/getProperty prop9))
(def p6 (System/getProperty prop6))
(def pos (System/getProperty ppos))

;; some help from http://stackoverflow.com/questions/4635680/what-is-the-best-way-to-get-date-and-time-in-clojure
(javax.swing.JOptionPane/showMessageDialog nil 
	(str "Hello " userN "\n" "Your Home Dir is " userH "\nRunning " p8 " " p9 "\nJava " p6 "\nOS " pos "\n" (now)) )  
		; prints hello and the user name 

;; http://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
;; http://stackoverflow.com/questions/4635680/what-is-the-best-way-to-get-date-and-time-in-clojure


;; this can be executed from the command line    clojure javax-clojure2.clj  
(def prop8 "os.arch") 	;;Operating system architecture
(def prop9 "os.name") 	;;Operating system name

(def User "mikeh")
(def UH "user.home")
(def UN "user.name")

(def userN (System/getProperty UN))
(def userH (System/getProperty UH))
(def p8 (System/getProperty prop8))
(def p9 (System/getProperty prop9))
(javax.swing.JOptionPane/showMessageDialog nil (str "Hello " userN "\n" "Your Home Dir is " userH "\nRunning " p8 " " p9 "\n" (now)) )  ; prints hello and the user name 

;; http://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html






