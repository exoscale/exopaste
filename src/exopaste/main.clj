(ns exopaste.main
  (:require [exopaste.system :refer [init-system start!]])
  (:gen-class))

(defn -main [& args]
  (init-system)
  (start!))
