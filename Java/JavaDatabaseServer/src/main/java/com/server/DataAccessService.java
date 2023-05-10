package com.server;

import com.DAO.DAO;
import com.model.Report;
import com.model.Review;
import com.model.User;
import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class DataAccessService extends AccessGrpc.AccessImplBase {
    private DAO Dao = new DAO();


    @Override
    public void getByUsername(DataAccess.UserGetUsername request, StreamObserver<DataAccess.User> responseObserver) {
        //super.getByUsername(request, responseObserver);
        User user = Dao.selectUserWithUsername(request.getUsername());

        //User user=new User(1,"hey","awdawdad","Admin");
        if (user == null) {
            DataAccess.User nullresponse = DataAccess.User.newBuilder()
                    .setId(1)
                    .setUsername("notfound")
                    .setPassword("notfound")
                    .setRole("notfound")
                    .build();

            responseObserver.onNext(nullresponse);
            responseObserver.onCompleted();
        }

        DataAccess.User response = DataAccess.User.newBuilder()
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setRole(user.getRole())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getById(DataAccess.UserGetId request, StreamObserver<DataAccess.User> responseObserver) {
        //super.getById(request, responseObserver);
        User user = Dao.selectUserWithId(request.getId());

        DataAccess.User response = DataAccess.User.newBuilder()
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setRole(user.getRole())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void createUser(DataAccess.UserCreate request, StreamObserver<DataAccess.UserCreateResponse> responseObserver) {
        //super.createUser(request, responseObserver);

        String username = request.getUserName();
        String password = request.getPassWord();
        String role = "User";

        Dao.insertUser(username, password, role);

        System.out.println("Received request ==> " + request);
        DataAccess.UserCreateResponse response = DataAccess.UserCreateResponse.newBuilder()
                .setCode(200)
                .setUserName(request.getUserName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getUsersContaining(DataAccess.SearchUserParameters request, StreamObserver<DataAccess.listOfUsers> responseObserver) {
        //super.getUsersContaining(request, responseObserver);
        DataAccess.listOfUsers.Builder builder = DataAccess.listOfUsers.newBuilder();

        ArrayList<User> users = Dao.getUsersWithString(request.getUsercontains());

        for (User user : users) {
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


    //Review
    @Override
    public void createReview(DataAccess.ReviewToCreate request, StreamObserver<DataAccess.ReviewCreated> responseObserver) {
        String comment = request.getComment();
        int starreveiw = request.getStarreview();
        int userid= request.getUserid();
        int categoryid= request.getCategoryid();
        String categoryname= request.getCategoryname();
        String categorytype= request.getCategorytype();

        Dao.insertReview(comment,starreveiw,userid,categoryid,categoryname,categorytype);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCreated response = DataAccess.ReviewCreated.newBuilder()
                .setCode(200)
                .setComment(request.getComment())
                        .setStarreview(request.getStarreview()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getReviewById(DataAccess.ReviewById request, StreamObserver<DataAccess.Review> responseObserver) {
        Review review = Dao.getReviewById(request.getId());

        DataAccess.Review response = DataAccess.Review.newBuilder()
                .setId(review.getId())
                .setComment(review.getComment())
                .setStarreview(review.getStarReview())
                .setUserid(review.getUserId())
                .setCategoryid(review.getCategoryId())
                .setCategoryname(review.getCategoryName())
                .setCategorytype(review.getCategoryType())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateReviewComment(DataAccess.ReviewsCommentToUpdate request, StreamObserver<DataAccess.ReviewCommentUpdated> responseObserver) {

        int id= request.getId();
        String comment = request.getComment();


        Dao.updateReviewComment(comment,id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCommentUpdated response = DataAccess.ReviewCommentUpdated.newBuilder()
                .setCode(200)
                .setComment(request.getComment()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void updateStarReview(DataAccess.ReviewStarReviewToUpdate request, StreamObserver<DataAccess.ReviewsStarReviewUpdated> responseObserver) {
        super.updateStarReview(request, responseObserver);
    }

    @Override
    public void deleteReview(DataAccess.ReviewToDelete request, StreamObserver<DataAccess.ReviewDeleted> responseObserver) {

        int id= request.getId();



        Dao.deleteReview(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewDeleted response = DataAccess.ReviewDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getListOfReviews(DataAccess.CategoryForReviewList request, StreamObserver<DataAccess.ReveiewList> responseObserver) {/*
        DataAccess.CategoryForReviewList.Builder builder = DataAccess.CategoryForReviewList.newBuilder();



        List<Review> reviews = Dao.listOfReviews(request.getCategoryid(),request.getCategoryname(),request.getCategorytype());

        for (Review review : reviews) {

            builder.(DataAccess.Review.newBuilder()
                    .setId(report.getId())
                    .setUserid(report.getUserId())
                    .setDescription(report.getDescription())
                    .setReviewid(report.getId())
                    .build());

        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();*/
    }


    //Report
    @Override
    public void getListOfReports(DataAccess.Empty request, StreamObserver<DataAccess.ListOfReports> responseObserver) {

        DataAccess.ListOfReports.Builder builder = DataAccess.ListOfReports.newBuilder();

        List<Report> reports = Dao.listOfReports(request.getEmpty());

        for (Report report : reports) {
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
