package com.server;

import com.DAO.DAO;
import com.model.User;
import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataAccessService extends AccessGrpc.AccessImplBase {
    private DAO Dao=new DAO();


    @Override
    public void getByUsername(DataAccess.UserGetUsername request, StreamObserver<DataAccess.User> responseObserver) {
        //super.getByUsername(request, responseObserver);
        User user=Dao.selectUserWithUsername(request.getUsername().toString());

        //User user=new User(1,"hey","awdawdad","Admin");
        
        DataAccess.User response= DataAccess.User.newBuilder()
                .setId(user.getId())
                .setUsername(user.getUsername().toString())
                .setPassword(user.getPassword().toString())
                .setRole(user.getRole().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

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
