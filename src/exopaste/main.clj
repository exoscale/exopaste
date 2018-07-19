(ns exopaste.main
  (:require [exopaste.system :refer [init-system start!]]))

(defn -main [& args]
  (init-system)
  (start!))
