package com.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class StartServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090).addService(new DataAccessService()).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
