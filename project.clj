(defproject exopaste "0.1.0-SNAPSHOT"
  :description "A pastebin clone storing data in-memory"
  :url "https://github.com/exoscale/exopaste"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main exopaste.main
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [aleph "0.4.6"]
                 [hiccup "1.0.5"]
                 [bidi "2.1.3"]])
