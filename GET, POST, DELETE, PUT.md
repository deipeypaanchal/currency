GET, POST, DELETE, PUT

GET - Retrieve something
POST - Create a new currency
DELETE - Delete a currency
PUT - Edit a currency

GET http://domain.com/v1/currencies
GET http://domain.com/v1/currency/1

POST http://domain.com/v2/currency

{
    "name": "USD",
    "valueinUSD" = 1 
}

PUT http://domain.com/v2/currency/10 - 200 - OK, 201 - Created

{
    "name": "EUR",
    "valueinUSD": 1.6
}

DELETE http://domain.com/v2/currency/10 - 404 Not Found

1xx - Information
2xx - Success
3xx - Redirects
4xx - Client side errors
5xx - Server errors

