(defproject proguard "0.1.0-SNAPSHOT"
  :description    "Testing proguard sample from web"
  :url            "http://http://stackoverflow.com/questions/12281365/obfuscating-clojure-uberjars-with-proguard"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]

  :main proguard.core
;;; Make sure everything is aot compiled
  :aot :all
;;; Remove source .clj files from the resulting jar
  :omit-source true

;; http://proguard.sourceforge.net/manual/usage.html
  )


