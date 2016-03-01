(with-open [rdr (clojure.java.io/reader "/home/mikeh/clojure/clojureInput.txt")]
         (count (line-seq rdr)))