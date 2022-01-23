# Spring Boot Device Seller

## EndPoints

### Sign-Up
....
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080

{
"name":"admin",
"username":"admin",
"password":"admin"
}
....

### Sign-In
....
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080

{
"username":"admin",
"password":"admin"
}
....

### Change-Role
....
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDMwNDE1OTV9.n8VGHuBARDbqWDEEg4DSza5WN90hB8RyWxiEo55Tc0Yggqm-J61JsOoxVkmQdMu3S7yV_nhAmZr7jni-p9GpMA
....

### Save Device
....
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDMwNDE1OTV9.n8VGHuBARDbqWDEEg4DSza5WN90hB8RyWxiEo55Tc0Yggqm-J61JsOoxVkmQdMu3S7yV_nhAmZr7jni-p9GpMA

{
"name":"device-2",
"description":"desc-2",
"price":15.5,
"deviceType":"TABLET"
}
....

### Get all Devices
....
GET /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDMwNDE1OTV9.n8VGHuBARDbqWDEEg4DSza5WN90hB8RyWxiEo55Tc0Yggqm-J61JsOoxVkmQdMu3S7yV_nhAmZr7jni-p9GpMA
....

### Delete Device
....
DELETE /api/device/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDMwNDE1OTV9.n8VGHuBARDbqWDEEg4DSza5WN90hB8RyWxiEo55Tc0Yggqm-J61JsOoxVkmQdMu3S7yV_nhAmZr7jni-p9GpMA
....

### Save Purchase
....
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDMwNDE1OTV9.n8VGHuBARDbqWDEEg4DSza5WN90hB8RyWxiEo55Tc0Yggqm-J61JsOoxVkmQdMu3S7yV_nhAmZr7jni-p9GpMA

{
"userId": 2,
"deviceId": 1,
"price": 9,
"color": "blue"
}
....

### Get all Purchases
....
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDMwNDE1OTV9.n8VGHuBARDbqWDEEg4DSza5WN90hB8RyWxiEo55Tc0Yggqm-J61JsOoxVkmQdMu3S7yV_nhAmZr7jni-p9GpMA
....