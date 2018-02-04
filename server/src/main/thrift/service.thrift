namespace java com.ben
include "order.thrift"

exception OrderValidationException {
    string message;
}

service OrderPlacingService {
    order.Order placeOrder(1: order.Order order) throws (1: OrderValidationException orderValidationException);
}
