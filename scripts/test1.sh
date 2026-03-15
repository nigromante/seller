#!/bin/bash

curl -s --request POST \
    --header "Content-Type: application/json" \
    --data '{ "customerId" : "createorder", "orderId" : "orderone" }' \
    http://localhost:8080/order/create \
    |  json_pp \
/ 

  
