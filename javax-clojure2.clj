;; 24 April 2015
;; mod to read real System property
;; (str "Hello" User)


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
(javax.swing.JOptionPane/showMessageDialog nil (str "Hello " userN "\n" "Your Home Dir is " userH "\nRunning " p8 " " p9) )  ; prints hello and the user name 

;; http://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html




