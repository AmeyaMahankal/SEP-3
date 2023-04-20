package com.example.sdj3assignment3;

import com.sdj3.protobuf.RetrieverGrpc;
import com.sdj3.protobuf.RetrieverOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sdj3Assignment3ApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void testProductsRetriever() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(
                "localhost", 9090
        ).usePlaintext().build();

        RetrieverGrpc.RetrieverBlockingStub retrievingBlockingtub =
                RetrieverGrpc.newBlockingStub(managedChannel);

        RetrieverOuterClass.TextInput request=RetrieverOuterClass.TextInput.newBuilder().setInput("chicken").build();

        RetrieverOuterClass.TextOutput resonse=retrievingBlockingtub
                .productsRetriever(request
                );

        System.out.println("Received " + resonse.getOutput());
        assert(resonse.getOutput().equals("[Breast, back, thigh]"));
    }

    @Test
    public void testRegistrationNumbersRetriever()
    {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(
                "localhost", 9090
        ).usePlaintext().build();

        RetrieverGrpc.RetrieverBlockingStub retrievingBlockingtub =
                RetrieverGrpc.newBlockingStub(managedChannel);

        RetrieverOuterClass.TextInput request=RetrieverOuterClass.TextInput.newBuilder().setInput("Breast").build();

        RetrieverOuterClass.TextOutput resonse=retrievingBlockingtub
                .registrationNumbersRetriever(request
                );

        System.out.println("Received " + resonse.getOutput());
        assert(resonse.getOutput().equals("[1, 2, 3]"));

    }


}










