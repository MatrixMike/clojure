(defproject stringeye "0.1.3-SNAPSHOT"
  :description "stringeye"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]

:main stringeye.core
  :aot :all
  :omit-source true
;;  :java-source-paths src/utils/demo.java
  :java-source-paths ["src/utils"]
)
