(ns exopaste.system
  (:require [com.stuartsierra.component :as component]
            [exopaste.server :as server]
            [exopaste.store :as store]
            [clojure.tools.logging :refer [error]]))

(def ^:redef system
  "Holds our system."
  nil)

(defn build-system
  "Defines our system map."
  []
  (try
    (-> (component/system-map
         :server (server/make-server)
         :store (store/make-store))
        (component/system-using {:server [:store]}))
    (catch Exception e
      (error "Failed to build system" e))))

(defn init-system
  []
  (let [sys (build-system)]
    (alter-var-root #'system (constantly sys))))

(defn stop!
  "Stop system"
  []
  (alter-var-root #'system component/stop-system))

(defn start!
  "Start system"
  []
  (alter-var-root #'system component/start-system)
  (println "System started"))
