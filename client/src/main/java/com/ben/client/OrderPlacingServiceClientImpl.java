package com.ben.client;

import com.ben.Customer;
import com.ben.Order;
import com.ben.OrderPlacingService;
import com.ben.OrderValidationException;
import com.ben.Product;
import com.ben.Shipping;
import com.ben.ShippingType;
import com.ben.Status;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Slf4j
public class OrderPlacingServiceClientImpl {
    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket("localhost", 9090);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        OrderPlacingService.Client OrderPlacingServiceClient = new OrderPlacingService.Client(protocol);

        Customer customer = new Customer("Tom", "Jones", 750);
        Shipping shipping = new Shipping(ShippingType.NEXT_DAY, "13.99");
        ArrayList<Product> products = new ArrayList<Product>() {{
            add(new Product("123456", "Headphones", "49.99"));
            add(new Product("223344", "T-Shirt", "11.99"));
        }};
        String date = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        Order order = new Order(date, customer, Status.PENDING, shipping, products);

        try {
            System.out.println(OrderPlacingServiceClient.placeOrder(order));
        } catch (OrderValidationException e) {
            log.error("Order validation exception:", e);
        }

        transport.close();
    }
}
