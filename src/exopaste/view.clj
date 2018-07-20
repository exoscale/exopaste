(ns exopaste.view
  (:require [hiccup.page :refer [html5 include-js include-css]]
            [hiccup.form :refer [form-to text-area submit-button]]))

(defn render-paste
  "given a map representing a paste, return an HTML string for the display of a paste."
  [paste]
  (html5 {:lang "en"}
         [:head
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/highlight.min.js")
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/go.min.js")
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/clojure.min.js")
          (include-js "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/yaml.min.js")
          (include-css "https://sos-de-fra-1.exo.io/highlight.js/9.12.0/default.min.css")
          [:script "hljs.initHighlightingOnLoad();"]]
         [:body
          [:pre [:code (:content paste)]]]))

(defn render-form
  []
  (html5 {:lang "en"}
         [:body
          (form-to [:post "/"]
                   (text-area {:cols 80
                               :rows 10} "content")
                   [:div]
                   (submit-button "Paste!"))]))
