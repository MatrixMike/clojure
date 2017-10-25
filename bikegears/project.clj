(defproject bikegears "0.1.3-SNAPSHOT"
  :description "Program to create the gear ratios for a push-bike given the numbers of teeth on the front and rear cogs"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
    [expresso "0.2.2"]
   ]
  
  :main bikegears.core
  :aot :all
  :omit-source true
  )
