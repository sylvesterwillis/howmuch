(ns howmuch.routes.index
  (:require [howmuch.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn index-page []
  (layout/render
    "index.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page []
  (layout/render "about.html"))

(defroutes index-routes
  (GET "/" [] (index-page))
  (GET "/about" [] (about-page)))

