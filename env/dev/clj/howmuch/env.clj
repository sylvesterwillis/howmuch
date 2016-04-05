(ns howmuch.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [howmuch.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[howmuch started successfully using the development profile]=-"))
   :middleware wrap-dev})
