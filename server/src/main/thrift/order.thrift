namespace java com.ben
include "customer.thrift"
include "shipping.thrift"
include "product.thrift"

enum Status {
    PENDING,
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REJECTED
}

struct Order {
    1: string date,
    2: customer.Customer customer,
    3: Status status,
    4: shipping.Shipping shipping,
    5: list<product.Product> products
}