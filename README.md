# AlgoDomain-Test

AlgoDomain-Test
Create RESTfull API using Java 8 with Spring Boot, perform CRUD operations on Product entity to add/update/delete products.

Inserting data
POST-API http://localhost:8080/placeOrder

LIKE: 
{
    "category" :{
        "productCategory":"electronics",
        "discount":15,
        "gst":12,
        "deliveryCharge":350,
        "products": [
            {
            "productName":"Lenovo Yoga",
            "productType":"laptop",
            "productPrice":42000
            },
            {
            "productName":"Samsung S22",
            "productType":"Mobile",
            "productPrice":50000
            }
        ]
    }
}


Getting All data
GET-API http://localhost:8080/findAllOrders 
result: 
[
    {
        "productCategory": "electronics",
        "discount": 15,
        "gst": 12,
        "deliveryCharge": 350,
        "products": [
            {
                "productId": 1,
                "productName": "Lenovo Yoga",
                "productType": "laptop",
                "productPrice": 42000
            },
            {
                "productId": 2,
                "productName": "Samsung S22",
                "productType": "Mobile",
                "productPrice": 50000
            }
        ]
    }
]



GET APIs we have
------------------
Getting all products: http://localhost:8080/product 
Getting product by Id: http://localhost:8080/product/id
