package com.ben.server;

import com.ben.Order;
import com.ben.OrderPlacingService;
import com.ben.OrderValidationException;
import com.ben.Status;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;

/**
 * Order placing handler
 */
@Slf4j
public class OrderPlacingHandler implements OrderPlacingService.Iface {
    /**
     * Constructor
     */
    public OrderPlacingHandler() {
    }

    /**
     * Place order according to business logic
     *
     * @param order input
     * @return order with status set
     * @throws OrderValidationException if order validation fails
     * @throws TException
     */
    @Override
    public Order placeOrder(Order order) throws OrderValidationException, TException {
        //Dummy condition
        if (order.getProducts().size() > 2) {
            String errorMessage = "Too many products";
            log.error(errorMessage);
            throw new OrderValidationException(errorMessage);
        }

        order.setStatus(Status.PLACED);
        return order;
    }
}
