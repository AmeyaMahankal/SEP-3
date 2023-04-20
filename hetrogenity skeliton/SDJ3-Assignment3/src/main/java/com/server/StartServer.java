package com.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.sql.SQLException;

public class StartServer {


    public StartServer() {
    }

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        Server server = ServerBuilder.forPort(9090).addService(new RetrieverServer()).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();


    }
}