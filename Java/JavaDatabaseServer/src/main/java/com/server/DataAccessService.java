package com.server;

import com.DAO.DAO;
import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class DataAccessService extends AccessGrpc.AccessImplBase {

    private DAO Dao;
    @Override
    public void createUser(DataAccess.UserCreate request, StreamObserver<DataAccess.UserCreateResponse> responseObserver) {
        //super.createUser(request, responseObserver);

        String username=request.getUserName().toString();
        String password=request.getPassWord().toString();
        String role="User";

        //Dao.insert(username,password,role);

        System.out.println("Received request ==> " + request.toString());
        DataAccess.UserCreateResponse response= DataAccess.UserCreateResponse.newBuilder()
                .setCode(200)
                .setUserName(request.getUserName().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }


}
