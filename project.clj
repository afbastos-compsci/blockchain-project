(defproject financeiro "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [clj-http "3.9.1"]]
  :plugins [[lein-ring "0.12.1"]]
  :ring {:handler financeiro.handler/app}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring/ring-mock "0.3.2"]
                                  [midje "1.9.6"]
                                  [ring/ring-core "1.7.1"]
                                  [ring/ring-jetty-adapter "1.7.1"]]
                   :plugins [[lein-midje "3.2.1"]
                             [lein-cloverage "1.0.13"]]}})