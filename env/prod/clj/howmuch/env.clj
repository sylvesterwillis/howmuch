(ns howmuch.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[howmuch started successfully]=-"))
   :middleware identity})
