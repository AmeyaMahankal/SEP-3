package com.Client;

import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import com.server.DataAccessService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DataClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost",9090)
                .usePlaintext().build();

        AccessGrpc.AccessBlockingStub blockingStub=AccessGrpc.newBlockingStub(managedChannel);

        //CREATE USER--

        DataAccess.UserCreate request=DataAccess.UserCreate.newBuilder()
                .setUserName("fgdgh")
                .setPassWord("sdf").build();

        DataAccess.UserCreateResponse response= blockingStub.createUser(request);
        System.out.println("Received and created ==> " + response.getUserName());

        //GET USERNAME--

        DataAccess.UserGetUsername request2= DataAccess.UserGetUsername.newBuilder()
                .setUsername("bobby")
                .build();

        DataAccess.User response2 =blockingStub.getByUsername(request2);
        System.out.println(response2.getPassword().toString());
    }
}
