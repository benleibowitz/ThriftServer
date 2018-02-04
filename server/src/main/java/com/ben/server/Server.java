package com.ben.server;

import com.ben.ApplicationConstants;
import com.ben.OrderPlacingService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * Server
 */
@Slf4j
public class Server {
    /**
     * Run server
     * @param processor OrderPlacingService processor
     */
    private static void run(OrderPlacingService.Processor<OrderPlacingHandler> processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(ApplicationConstants.PORT);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
            server.serve();
            log.info("Server started");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method
     * @param args input
     */
    public static void main(String[] args) {
        run(new OrderPlacingService.Processor(new OrderPlacingHandler()));
    }

}
