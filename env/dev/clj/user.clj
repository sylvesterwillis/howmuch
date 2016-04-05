(ns user
  (:require [mount.core :as mount]
            howmuch.core))

(defn start []
  (mount/start-without #'howmuch.core/repl-server))

(defn stop []
  (mount/stop-except #'howmuch.core/repl-server))

(defn restart []
  (stop)
  (start))


