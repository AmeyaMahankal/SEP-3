package com.server;

import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.stub.StreamObserver;

public class DataAccessService extends AccessGrpc.AccessImplBase {
    @Override
    public void createUser(DataAccess.UserCreate request, StreamObserver<DataAccess.UserCreateResponse> responseObserver) {
        //super.createUser(request, responseObserver);
        System.out.println("Received request ==> " + request.toString());
        DataAccess.UserCreateResponse response= DataAccess.UserCreateResponse.newBuilder()
                .setCode(200)
                .setUserName(request.getUserName().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
