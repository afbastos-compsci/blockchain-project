(ns financeiro.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Ola, mundo!")
  (GET "/saldo" [] "0")
  (route/not-found "Recurso nao encontrado"))


