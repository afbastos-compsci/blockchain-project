(ns financeiro.handler-test
  (:require [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [financeiro.handler :refer :all]
            [clj-http.client :as http]))

(facts "Saldo inicial e 0 " :aceitacao
       
       (iniciar-servidor 3001)

       (:body (http/get "http://localhost:3001/saldo")) => "0"
       
       (parar-servidor)
       )
