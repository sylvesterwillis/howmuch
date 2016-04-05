(ns howmuch.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [howmuch.layout :refer [error-page]]
            [howmuch.routes.index :refer [index-routes]]
            [compojure.route :as route]
            [howmuch.middleware :as middleware]))

(def app-routes
  (routes
    (wrap-routes #'index-routes middleware/wrap-csrf)
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))

(def app (middleware/wrap-base #'app-routes))
