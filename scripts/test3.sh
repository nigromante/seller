#!/bin/bash

curl -s -X POST http://localhost:8080/order/find?orderId=1234 |  json_pp
