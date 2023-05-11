package com.server;

import com.DAO.DAO;
import com.model.*;
import com.sdj3.protobuf.AccessGrpc;
import com.sdj3.protobuf.DataAccess;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Collections;
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

    // Zsolt


    //Museum

    @Override
    public void createMuseum(DataAccess.MuseumToCreate request, StreamObserver<DataAccess.MuseumCreated> responseObserver) {


        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertMuseum(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.MuseumCreated response = DataAccess.MuseumCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void getMuseumByName(DataAccess.MuseumByName request, StreamObserver<DataAccess.Museum> responseObserver) {
            Museum museum = Dao.getMuseumByName(request.getMuseumname());

            if (museum == null) {
                DataAccess.Museum nullresponse = DataAccess.Museum.newBuilder()
                        .setId(0)
                        .setName("notfound")
                        .setDescription("notfound")
                        .setImageurl("notfound")
                        .setCityid(0)
                        .build();

                responseObserver.onNext(nullresponse);
                responseObserver.onCompleted();
            }

            DataAccess.Museum response = DataAccess.Museum.newBuilder()
                    .setId(museum.getId())
                    .setName(museum.getName())
                    .setDescription(museum.getDescription())
                    .setImageurl(museum.getImageURL())
                    .setCityid(museum.getCityId())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

    }

    @Override
    public void getMuseumById(DataAccess.MuseumById request, StreamObserver<DataAccess.Museum> responseObserver) {

        Museum museum = Dao.getMuseumyById(request.getMuseumid());

        DataAccess.Museum response = DataAccess.Museum.newBuilder()
                .setId(museum.getId())
                .setName(museum.getName())
                .setDescription(museum.getDescription())
                .setImageurl(museum.getImageURL())
                .setCityid(museum.getCityId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateMuseumName(DataAccess.MuseumNameToUpdate request, StreamObserver<DataAccess.MuseumNameUpdated> responseObserver) {


        String name = request.getName();
        int id = request.getMuseumid();


        Dao.updateMuseumName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.MuseumNameUpdated response = DataAccess.MuseumNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void updateMuseumDescription(DataAccess.MuseumDescriptionToUpdate request, StreamObserver<DataAccess.MuseumDescriptionUpdated> responseObserver) {


        String Description = request.getDescription();
        int id = request.getMuseumid();


        Dao.updateMuseumDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.MuseumDescriptionUpdated response = DataAccess.MuseumDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void deleteMuseum(DataAccess.MuseumToDelete request, StreamObserver<DataAccess.MuseumDeleted> responseObserver) {

        int id = request.getMuseumid();


        Dao.deleteMuseum(id);

        System.out.println("Received request ==> " + request);
        DataAccess.MuseumDeleted response = DataAccess.MuseumDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();



    }

    @Override
    public void getListOfMuseums(DataAccess.CitysIdForMuseumList request, StreamObserver<DataAccess.ListOfMuseums> responseObserver) {

        DataAccess.ListOfMuseums.Builder builder = DataAccess.ListOfMuseums.newBuilder();

        List<Museum> museums = Dao.listOfMuseums(request.getCityid());

        for (Museum museum : museums) {
            builder.addMuseum(DataAccess.Museum.newBuilder()
                    .setId(museum.getId())
                    .setName(museum.getName())
                    .setDescription(museum.getDescription())
                    .setImageurl(museum.getImageURL())
                    .setCityid(museum.getCityId())
                    .build());


        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();

    }


    //Park


    @Override
    public void createPark(DataAccess.ParkToCreate request, StreamObserver<DataAccess.ParkCreated> responseObserver) {


        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertPark(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.ParkCreated response = DataAccess.ParkCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getParkByName(DataAccess.ParkByName request, StreamObserver<DataAccess.Park> responseObserver) {

        Park park = Dao.getParkByName(request.getParkname());

        if (park == null) {
            DataAccess.Park nullresponse = DataAccess.Park.newBuilder()
                    .setId(0)
                    .setName("notfound")
                    .setDescription("notfound")
                    .setImageurl("notfound")
                    .setCityid(0)
                    .build();

            responseObserver.onNext(nullresponse);
            responseObserver.onCompleted();
        }

        DataAccess.Park response = DataAccess.Park.newBuilder()
                .setId(park.getId())
                .setName(park.getName())
                .setDescription(park.getDescription())
                .setImageurl(park.getImageURL())
                .setCityid(park.getCityId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void getParkById(DataAccess.ParkById request, StreamObserver<DataAccess.Park> responseObserver) {

        Park park = Dao.getParkById(request.getParkid());

        DataAccess.Park response = DataAccess.Park.newBuilder()
                .setId(park.getId())
                .setName(park.getName())
                .setDescription(park.getDescription())
                .setImageurl(park.getImageURL())
                .setCityid(park.getCityId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void updateParkName(DataAccess.ParkNameToUpdate request, StreamObserver<DataAccess.ParkNameUpdated> responseObserver) {

        String name = request.getName();
        int id = request.getParkid();


        Dao.updateParkName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ParkNameUpdated response = DataAccess.ParkNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void updateParkDescription(DataAccess.ParkDescriptionToUpdate request, StreamObserver<DataAccess.ParkDescriptionUpdated> responseObserver) {


        String Description = request.getDescription();
        int id = request.getParkid();


        Dao.updateParkDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ParkDescriptionUpdated response = DataAccess.ParkDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void deletePark(DataAccess.ParkToDelete request, StreamObserver<DataAccess.ParkDeleted> responseObserver) {

        int id = request.getParkid();


        Dao.deletePark(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ParkDeleted response = DataAccess.ParkDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void getListOfParks(DataAccess.CitysIdForParkList request, StreamObserver<DataAccess.ListOfParks> responseObserver) {

        DataAccess.ListOfParks.Builder builder = DataAccess.ListOfParks.newBuilder();

        List<Park> parks = Dao.listOfParks(request.getCityid());

        for (Park park : parks) {
            builder.addPark(DataAccess.Park.newBuilder()
                    .setId(park.getId())
                    .setName(park.getName())
                    .setDescription(park.getDescription())
                    .setImageurl(park.getImageURL())
                    .setCityid(park.getCityId())
                    .build());


        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();

    }


    //Restaurant



    @Override
    public void createRestaurant(DataAccess.RestaurantToCreate request, StreamObserver<DataAccess.RestaurantCreated> responseObserver) {

        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertRestaurant(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.RestaurantCreated response = DataAccess.RestaurantCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRestaurantByName(DataAccess.RestaurantByName request, StreamObserver<DataAccess.Restaurant> responseObserver) {

        Restaurant restaurant = Dao.getRestaurantByName(request.getRestaurantname());

        if (restaurant == null) {
            DataAccess.Restaurant nullresponse = DataAccess.Restaurant.newBuilder()
                    .setId(0)
                    .setName("notfound")
                    .setDescription("notfound")
                    .setImageurl("notfound")
                    .setCityid(0)
                    .build();

            responseObserver.onNext(nullresponse);
            responseObserver.onCompleted();
        }

        DataAccess.Restaurant response = DataAccess.Restaurant.newBuilder()
                .setId(restaurant.getId())
                .setName(restaurant.getName())
                .setDescription(restaurant.getDescription())
                .setImageurl(restaurant.getImageURL())
                .setCityid(restaurant.getCityId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void getRestaurantById(DataAccess.RestaurantById request, StreamObserver<DataAccess.Restaurant> responseObserver) {

       Restaurant restaurant = Dao.getRestaurantById(request.getRestaurantid());

        DataAccess.Restaurant response = DataAccess.Restaurant.newBuilder()
                .setId(restaurant.getId())
                .setName(restaurant.getName())
                .setDescription(restaurant.getDescription())
                .setImageurl(restaurant.getImageURL())
                .setCityid(restaurant.getCityId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void updateRestaurantName(DataAccess.RestaurantNameToUpdate request, StreamObserver<DataAccess.RestaurantNameUpdated> responseObserver) {

        String name = request.getName();
        int id = request.getRestaurantid();


        Dao.updateRestaurantName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.RestaurantNameUpdated response = DataAccess.RestaurantNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void updateRestaurantDescription(DataAccess.RestaurantDescriptionToUpdate request, StreamObserver<DataAccess.RestaurantDescriptionUpdated> responseObserver) {

        String Description = request.getDescription();
        int id = request.getRestaurantid();


        Dao.updateRestaurantDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.RestaurantDescriptionUpdated response = DataAccess.RestaurantDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteRestaurant(DataAccess.RestaurantToDelete request, StreamObserver<DataAccess.RestaurantDeleted> responseObserver) {

        int id = request.getRestaurantid();


        Dao.deleteRestaurant(id);

        System.out.println("Received request ==> " + request);
        DataAccess.RestaurantDeleted response = DataAccess.RestaurantDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getListOfRestaurant(DataAccess.CitysIdForRestaurantList request, StreamObserver<DataAccess.ListOfRestaurants> responseObserver) {
        DataAccess.ListOfRestaurants.Builder builder = DataAccess.ListOfRestaurants.newBuilder();

        List<Restaurant> restaurants = Dao.listOfRestaurant(request.getCityid());

        for (Restaurant restaurant : restaurants) {
            builder.addRestaurant(DataAccess.Restaurant.newBuilder()
                    .setId(restaurant.getId())
                    .setName(restaurant.getName())
                    .setDescription(restaurant.getDescription())
                    .setImageurl(restaurant.getImageURL())
                    .setCityid(restaurant.getCityId())
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
        int userid = request.getUserid();
        int categoryid = request.getCategoryid();
        String categoryname = request.getCategoryname();
        String categorytype = request.getCategorytype();

        Dao.insertReview(comment, starreveiw, userid, categoryid, categoryname, categorytype);

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

        int id = request.getId();
        String comment = request.getComment();


        Dao.updateReviewComment(comment, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCommentUpdated response = DataAccess.ReviewCommentUpdated.newBuilder()
                .setCode(200)
                .setComment(request.getComment()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void updateStarReview(DataAccess.ReviewStarReviewToUpdate request, StreamObserver<DataAccess.ReviewsStarReviewUpdated> responseObserver) {
        int id = request.getId();
        int starreview = request.getStarreview();


        Dao.updateStarReview(starreview, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewsStarReviewUpdated response = DataAccess.ReviewsStarReviewUpdated.newBuilder()
                .setCode(200)
                .setStarreview(request.getStarreview())
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReview(DataAccess.ReviewToDelete request, StreamObserver<DataAccess.ReviewDeleted> responseObserver) {

        int id = request.getId();


        Dao.deleteReview(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewDeleted response = DataAccess.ReviewDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getListOfReviews(DataAccess.CategoryForReviewList request, StreamObserver<DataAccess.ReveiewList> responseObserver) {
        DataAccess.ReveiewList.Builder builder = DataAccess.ReveiewList.newBuilder();

        List<Review> reviews = Dao.listOfReviews(request.getCategoryid(), request.getCategoryname(), request.getCategorytype());

        for (Review review : reviews) {
            builder.addReviews(DataAccess.Review.newBuilder()
                    .setId(review.getId())
                    .setComment(review.getComment())
                    .setStarreview(review.getStarReview())
                    .setUserid(review.getUserId())
                    .setCategoryid(review.getCategoryId())
                    .setCategoryname(review.getCategoryName())
                    .setCategorytype(review.getCategoryType())
                    .build());


        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


    //Report


    @Override
    public void createReport(DataAccess.ReportToCreate request, StreamObserver<DataAccess.ReportCreated> responseObserver) {
        int userid = request.getUserid();
        String description = request.getDescription();
        int reviewid = request.getReviewid();

        Dao.insertReport( userid,description,reviewid);

        System.out.println("Received request ==> " + request);
        DataAccess.ReportCreated response = DataAccess.ReportCreated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getReportById(DataAccess.ReportById request, StreamObserver<DataAccess.Report> responseObserver) {
        Report report = Dao.getReportById(request.getReportid());

        DataAccess.Report response = DataAccess.Report.newBuilder()
                .setId(report.getId())
                .setDescription(report.getDescription())
                .setUserid(report.getUserId())
                .setReviewid(report.getReviewId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReport(DataAccess.ReportToDelete request, StreamObserver<DataAccess.ReportDeleted> responseObserver) {
        int id = request.getReportid();


        Dao.deleteReport(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReportDeleted response = DataAccess.ReportDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


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
