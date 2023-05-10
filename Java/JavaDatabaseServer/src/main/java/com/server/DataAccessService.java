package com.server;

import com.DAO.DAO;
import com.model.Report;
import com.model.User;
import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class DataAccessService extends AccessGrpc.AccessImplBase {
    private DAO Dao=new DAO();


    @Override
    public void getByUsername(DataAccess.UserGetUsername request, StreamObserver<DataAccess.User> responseObserver) {
        //super.getByUsername(request, responseObserver);
        User user=Dao.selectUserWithUsername(request.getUsername().toString());

        //User user=new User(1,"hey","awdawdad","Admin");
        if(user==null)
        {
            DataAccess.User nullresponse= DataAccess.User.newBuilder()
                    .setId(1)
                    .setUsername("notfound")
                    .setPassword("notfound")
                    .setRole("notfound")
                    .build();

            responseObserver.onNext(nullresponse);
            responseObserver.onCompleted();
        }

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
    public void getById(DataAccess.UserGetId request, StreamObserver<DataAccess.User> responseObserver) {
        //super.getById(request, responseObserver);
        User user=Dao.selectUserWithId(request.getId());

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

        Dao.insertUser(username,password,role);

        System.out.println("Received request ==> " + request);
        DataAccess.UserCreateResponse response= DataAccess.UserCreateResponse.newBuilder()
                .setCode(200)
                .setUserName(request.getUserName().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getUsersContaining(DataAccess.SearchUserParameters request, StreamObserver<DataAccess.listOfUsers> responseObserver) {
        //super.getUsersContaining(request, responseObserver);
        DataAccess.listOfUsers.Builder builder = DataAccess.listOfUsers.newBuilder();

        ArrayList<User> users=Dao.getUsersWithString(request.getUsercontains().toString());

        for(User user : users)
        {
            builder.addUsers(DataAccess.User.newBuilder()
                    .setRole(user.getRole())
                    .setPassword(user.getPassword())
                    .setUsername(user.getUsername())
                    .setId(user.getId())
                    .build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


    @Override
    public void getListOfReports(DataAccess.Empty request, StreamObserver<DataAccess.ListOfReports> responseObserver) {

        DataAccess.ListOfReports.Builder builder = DataAccess.ListOfReports.newBuilder();

        List<Report> reports=Dao.listOfReports(request.getEmpty());

        for (Report report: reports) {
            builder.addReport(DataAccess.Report.newBuilder()
                            .setId(report.getId())
                    .setUserid(report.getUserId())
                    .setDescription(report.getDescription())
                    .setReviewid(report.getId())
                    .build());

        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();

    }
}
