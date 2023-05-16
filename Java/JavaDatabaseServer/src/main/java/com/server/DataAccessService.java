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


    //City

    @Override
    public void createCity(DataAccess.CityToCreate request, StreamObserver<DataAccess.CityCreated> responseObserver) {


        String name = request.getName();
        String description = request.getDescription();
        String ImageURL = request.getImageurl();

        Dao.insertCity(name, description, ImageURL);

        System.out.println("Received request ==> " + request);
        DataAccess.CityCreated response = DataAccess.CityCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }


    @Override
    public void getCityById(DataAccess.CityById request, StreamObserver<DataAccess.City> responseObserver) {

        City city = Dao.getCityById(request.getCityid());

        DataAccess.City response = DataAccess.City.newBuilder()
                .setId(city.getId())
                .setName(city.getName())
                .setDescription(city.getDescription())
                .setImageurl(city.getImageURL())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    //Hotel


    @Override
    public void createHotel(DataAccess.CategoryToCreate request, StreamObserver<DataAccess.CategoryCreated> responseObserver) {
        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertHotel(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryCreated response = DataAccess.CategoryCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHotelById(DataAccess.CategoryById request, StreamObserver<DataAccess.Category> responseObserver) {
        Hotel hotel = Dao.getHotelyById(request.getCategoryid());

        DataAccess.Category response = DataAccess.Category.newBuilder()
                .setId(hotel.getId())
                .setName(hotel.getName())
                .setDescription(hotel.getDescription())
                .setImageurl(hotel.getImageURL())
                .setCityid(hotel.getCityId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateHotelName(DataAccess.CategoryNameToUpdate request, StreamObserver<DataAccess.CategoryNameUpdated> responseObserver) {
        String name = request.getName();
        int id = request.getCategoryid();


        Dao.updateHotelName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryNameUpdated response = DataAccess.CategoryNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void updateHotelDescription(DataAccess.CategoryDescriptionToUpdate request, StreamObserver<DataAccess.CategoryDescriptionUpdated> responseObserver) {
        String Description = request.getDescription();
        int id = request.getCategoryid();


        Dao.updateHotelDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDescriptionUpdated response = DataAccess.CategoryDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteHotel(DataAccess.CategoryToDelete request, StreamObserver<DataAccess.CategoryDeleted> responseObserver) {
        int id = request.getCategoryid();


        Dao.deleteHotel(id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDeleted response = DataAccess.CategoryDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getListOfHotels(DataAccess.CitysIdForCategoryList request, StreamObserver<DataAccess.ListOfACategory> responseObserver) {
        DataAccess.ListOfACategory.Builder builder = DataAccess.ListOfACategory.newBuilder();

        List<Hotel> hotels = Dao.listOfHotels(request.getCityid());

        for (Hotel hotel : hotels) {
            builder.addCategories(DataAccess.Category.newBuilder()
                    .setId(hotel.getId())
                    .setName(hotel.getName())
                    .setDescription(hotel.getDescription())
                    .setImageurl(hotel.getImageURL())
                    .setCityid(hotel.getCityId())
                    .build());


        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


    //Hotel Reviews
    @Override
    public void createHotelsReview(DataAccess.ReviewToCreate request, StreamObserver<DataAccess.ReviewCreated> responseObserver) {
        String comment = request.getComment();
        int starreveiw = request.getStarreview();
        int userid = request.getUserid();
        int categoryid = request.getCategoryid();


        Dao.insertHotelReview(comment, starreveiw, userid, categoryid);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCreated response = DataAccess.ReviewCreated.newBuilder()
                .setCode(200)
                .setComment(request.getComment())
                .setStarreview(request.getStarreview()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHotelsReviewById(DataAccess.ReviewById request, StreamObserver<DataAccess.Review> responseObserver) {
        Review review = Dao.getHotelsReviewById(request.getId());

        DataAccess.Review response = DataAccess.Review.newBuilder()
                .setId(review.getId())
                .setComment(review.getComment())
                .setStarreview(review.getStarReview())
                .setUserid(review.getUserId())
                .setCategoryid(review.getCategoryId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateHotelsReviewComment(DataAccess.ReviewsCommentToUpdate request, StreamObserver<DataAccess.ReviewCommentUpdated> responseObserver) {
        int id = request.getId();
        String comment = request.getComment();


        Dao.updateHotelsReviewComment(comment, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCommentUpdated response = DataAccess.ReviewCommentUpdated.newBuilder()
                .setCode(200)
                .setComment(request.getComment()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateHotelsStarReview(DataAccess.ReviewStarReviewToUpdate request, StreamObserver<DataAccess.ReviewsStarReviewUpdated> responseObserver) {
        int id = request.getId();
        int starreview = request.getStarreview();


        Dao.updateHotelsStarReview(starreview, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewsStarReviewUpdated response = DataAccess.ReviewsStarReviewUpdated.newBuilder()
                .setCode(200)
                .setStarreview(request.getStarreview())
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteHotelReview(DataAccess.ReviewToDelete request, StreamObserver<DataAccess.ReviewDeleted> responseObserver) {
        int id = request.getId();


        Dao.deleteHotelReview(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewDeleted response = DataAccess.ReviewDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getHotelReviewsContaining(DataAccess.SearchReviewPeremetars request, StreamObserver<DataAccess.ReveiewList> responseObserver) {
        DataAccess.ReveiewList.Builder builder = DataAccess.ReveiewList.newBuilder();

        ArrayList<Review> reviews = Dao.getHotelReviewsWithHotelId(request.getCategoryid());

        for (Review review : reviews) {
            builder.addReviews(DataAccess.Review.newBuilder()
                    .setId(review.getId())
                    .setComment(review.getComment())
                    .setStarreview(review.getStarReview())
                    .setUserid(review.getUserId())
                    .setCategoryid(review.getCategoryId())
                    .build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


    //Museum

    @Override
    public void createMuseum(DataAccess.CategoryToCreate request, StreamObserver<DataAccess.CategoryCreated> responseObserver) {
        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertMuseum(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryCreated response = DataAccess.CategoryCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMuseumById(DataAccess.CategoryById request, StreamObserver<DataAccess.Category> responseObserver) {
        Museum museum = Dao.getMuseumyById(request.getCategoryid());

        DataAccess.Category response = DataAccess.Category.newBuilder()
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
    public void updateMuseumName(DataAccess.CategoryNameToUpdate request, StreamObserver<DataAccess.CategoryNameUpdated> responseObserver) {
        String name = request.getName();
        int id = request.getCategoryid();


        Dao.updateMuseumName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryNameUpdated response = DataAccess.CategoryNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateMuseumDescription(DataAccess.CategoryDescriptionToUpdate request, StreamObserver<DataAccess.CategoryDescriptionUpdated> responseObserver) {
        String Description = request.getDescription();
        int id = request.getCategoryid();


        Dao.updateMuseumDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDescriptionUpdated response = DataAccess.CategoryDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteMuseum(DataAccess.CategoryToDelete request, StreamObserver<DataAccess.CategoryDeleted> responseObserver) {
        int id = request.getCategoryid();


        Dao.deleteMuseum(id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDeleted response = DataAccess.CategoryDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getListOfMuseums(DataAccess.CitysIdForCategoryList request, StreamObserver<DataAccess.ListOfACategory> responseObserver) {
        DataAccess.ListOfACategory.Builder builder = DataAccess.ListOfACategory.newBuilder();

        List<Museum> museums = Dao.listOfMuseums(request.getCityid());

        for (Museum museum : museums) {
            builder.addCategories(DataAccess.Category.newBuilder()
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

    // Museum Reviews
    @Override
    public void createMuseumsReview(DataAccess.ReviewToCreate request, StreamObserver<DataAccess.ReviewCreated> responseObserver) {
        String comment = request.getComment();
        int starreveiw = request.getStarreview();
        int userid = request.getUserid();
        int categoryid = request.getCategoryid();


        Dao.insertMuseumReview(comment, starreveiw, userid, categoryid);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCreated response = DataAccess.ReviewCreated.newBuilder()
                .setCode(200)
                .setComment(request.getComment())
                .setStarreview(request.getStarreview()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMuseumsReviewById(DataAccess.ReviewById request, StreamObserver<DataAccess.Review> responseObserver) {
        Review review = Dao.getMuseumsReviewById(request.getId());

        DataAccess.Review response = DataAccess.Review.newBuilder()
                .setId(review.getId())
                .setComment(review.getComment())
                .setStarreview(review.getStarReview())
                .setUserid(review.getUserId())
                .setCategoryid(review.getCategoryId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateMuseumsReviewComment(DataAccess.ReviewsCommentToUpdate request, StreamObserver<DataAccess.ReviewCommentUpdated> responseObserver) {
        int id = request.getId();
        String comment = request.getComment();


        Dao.updateMuseumsReviewComment(comment, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCommentUpdated response = DataAccess.ReviewCommentUpdated.newBuilder()
                .setCode(200)
                .setComment(request.getComment()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void updateMuseumsStarReview(DataAccess.ReviewStarReviewToUpdate request, StreamObserver<DataAccess.ReviewsStarReviewUpdated> responseObserver) {
        int id = request.getId();
        int starreview = request.getStarreview();


        Dao.updateMuseumsStarReview(starreview, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewsStarReviewUpdated response = DataAccess.ReviewsStarReviewUpdated.newBuilder()
                .setCode(200)
                .setStarreview(request.getStarreview())
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteMuseumsReview(DataAccess.ReviewToDelete request, StreamObserver<DataAccess.ReviewDeleted> responseObserver) {
        int id = request.getId();


        Dao.deleteMuseumReview(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewDeleted response = DataAccess.ReviewDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMuseumsReviewsContaining(DataAccess.SearchReviewPeremetars request, StreamObserver<DataAccess.ReveiewList> responseObserver) {
        DataAccess.ReveiewList.Builder builder = DataAccess.ReveiewList.newBuilder();

        ArrayList<Review> reviews = Dao.getMuseumReviewsWithMuseumsId(request.getCategoryid());

        for (Review review : reviews) {
            builder.addReviews(DataAccess.Review.newBuilder()
                    .setId(review.getId())
                    .setComment(review.getComment())
                    .setStarreview(review.getStarReview())
                    .setUserid(review.getUserId())
                    .setCategoryid(review.getCategoryId())
                    .build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


//Park

    @Override
    public void createPark(DataAccess.CategoryToCreate request, StreamObserver<DataAccess.CategoryCreated> responseObserver) {
        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertPark(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryCreated response = DataAccess.CategoryCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getParkById(DataAccess.CategoryById request, StreamObserver<DataAccess.Category> responseObserver) {
        Park park = Dao.getParkById(request.getCategoryid());

        DataAccess.Category response = DataAccess.Category.newBuilder()
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
    public void updateParkName(DataAccess.CategoryNameToUpdate request, StreamObserver<DataAccess.CategoryNameUpdated> responseObserver) {
        String name = request.getName();
        int id = request.getCategoryid();


        Dao.updateParkName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryNameUpdated response = DataAccess.CategoryNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateParkDescription(DataAccess.CategoryDescriptionToUpdate request, StreamObserver<DataAccess.CategoryDescriptionUpdated> responseObserver) {
        String Description = request.getDescription();
        int id = request.getCategoryid();


        Dao.updateParkDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDescriptionUpdated response = DataAccess.CategoryDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deletePark(DataAccess.CategoryToDelete request, StreamObserver<DataAccess.CategoryDeleted> responseObserver) {
        int id = request.getCategoryid();


        Dao.deletePark(id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDeleted response = DataAccess.CategoryDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getListOfParks(DataAccess.CitysIdForCategoryList request, StreamObserver<DataAccess.ListOfACategory> responseObserver) {
        DataAccess.ListOfACategory.Builder builder = DataAccess.ListOfACategory.newBuilder();

        List<Park> parks = Dao.listOfParks(request.getCityid());

        for (Park park : parks) {
            builder.addCategories(DataAccess.Category.newBuilder()
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

    // Park Reviews
    @Override
    public void createParksReview(DataAccess.ReviewToCreate request, StreamObserver<DataAccess.ReviewCreated> responseObserver) {
        String comment = request.getComment();
        int starreveiw = request.getStarreview();
        int userid = request.getUserid();
        int categoryid = request.getCategoryid();


        Dao.insertParkReview(comment, starreveiw, userid, categoryid);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCreated response = DataAccess.ReviewCreated.newBuilder()
                .setCode(200)
                .setComment(request.getComment())
                .setStarreview(request.getStarreview()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getParksReviewById(DataAccess.ReviewById request, StreamObserver<DataAccess.Review> responseObserver) {
        Review review = Dao.getParksReviewById(request.getId());

        DataAccess.Review response = DataAccess.Review.newBuilder()
                .setId(review.getId())
                .setComment(review.getComment())
                .setStarreview(review.getStarReview())
                .setUserid(review.getUserId())
                .setCategoryid(review.getCategoryId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateParksReviewComment(DataAccess.ReviewsCommentToUpdate request, StreamObserver<DataAccess.ReviewCommentUpdated> responseObserver) {
        int id = request.getId();
        String comment = request.getComment();


        Dao.updateParksReviewComment(comment, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCommentUpdated response = DataAccess.ReviewCommentUpdated.newBuilder()
                .setCode(200)
                .setComment(request.getComment()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void updateParksStarReview(DataAccess.ReviewStarReviewToUpdate request, StreamObserver<DataAccess.ReviewsStarReviewUpdated> responseObserver) {
        int id = request.getId();
        int starreview = request.getStarreview();


        Dao.updateParksStarReview(starreview, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewsStarReviewUpdated response = DataAccess.ReviewsStarReviewUpdated.newBuilder()
                .setCode(200)
                .setStarreview(request.getStarreview())
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteParksReview(DataAccess.ReviewToDelete request, StreamObserver<DataAccess.ReviewDeleted> responseObserver) {
        int id = request.getId();


        Dao.deleteParkReview(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewDeleted response = DataAccess.ReviewDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getParksReviewsContaining(DataAccess.SearchReviewPeremetars request, StreamObserver<DataAccess.ReveiewList> responseObserver) {
        DataAccess.ReveiewList.Builder builder = DataAccess.ReveiewList.newBuilder();

        ArrayList<Review> reviews = Dao.getParkReviewsWithParksId(request.getCategoryid());

        for (Review review : reviews) {
            builder.addReviews(DataAccess.Review.newBuilder()
                    .setId(review.getId())
                    .setComment(review.getComment())
                    .setStarreview(review.getStarReview())
                    .setUserid(review.getUserId())
                    .setCategoryid(review.getCategoryId())
                    .build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


//Restaurant

    @Override
    public void createRestaurant(DataAccess.CategoryToCreate request, StreamObserver<DataAccess.CategoryCreated> responseObserver) {
        String name = request.getName();
        String Description = request.getDescription();
        String imageURL = request.getImageurl();
        int cityId = request.getCityid();


        Dao.insertRestaurant(name, Description, imageURL, cityId);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryCreated response = DataAccess.CategoryCreated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRestaurantById(DataAccess.CategoryById request, StreamObserver<DataAccess.Category> responseObserver) {
        Restaurant restaurant = Dao.getRestaurantById(request.getCategoryid());

        DataAccess.Category response = DataAccess.Category.newBuilder()
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
    public void updateRestaurantName(DataAccess.CategoryNameToUpdate request, StreamObserver<DataAccess.CategoryNameUpdated> responseObserver) {
        String name = request.getName();
        int id = request.getCategoryid();


        Dao.updateRestaurantName(name, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryNameUpdated response = DataAccess.CategoryNameUpdated.newBuilder()
                .setCode(200)
                .setName(request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateRestaurantDescription(DataAccess.CategoryDescriptionToUpdate request, StreamObserver<DataAccess.CategoryDescriptionUpdated> responseObserver) {
        String Description = request.getDescription();
        int id = request.getCategoryid();


        Dao.updateRestaurantDescription(Description, id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDescriptionUpdated response = DataAccess.CategoryDescriptionUpdated.newBuilder()
                .setCode(200)
                .setDescription(request.getDescription())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteRestaurant(DataAccess.CategoryToDelete request, StreamObserver<DataAccess.CategoryDeleted> responseObserver) {
        int id = request.getCategoryid();


        Dao.deleteRestaurant(id);

        System.out.println("Received request ==> " + request);
        DataAccess.CategoryDeleted response = DataAccess.CategoryDeleted.newBuilder()
                .setCode(200)
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getListOfRestaurants(DataAccess.CitysIdForCategoryList request, StreamObserver<DataAccess.ListOfACategory> responseObserver) {
        DataAccess.ListOfACategory.Builder builder = DataAccess.ListOfACategory.newBuilder();

        List<Restaurant> restaurants = Dao.listOfRestaurant(request.getCityid());

        for (Restaurant restaurant : restaurants) {
            builder.addCategories(DataAccess.Category.newBuilder()
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

    // Museum Reviews
    @Override
    public void createRestaurantsReview(DataAccess.ReviewToCreate request, StreamObserver<DataAccess.ReviewCreated> responseObserver) {
        String comment = request.getComment();
        int starreveiw = request.getStarreview();
        int userid = request.getUserid();
        int categoryid = request.getCategoryid();


        Dao.insertRestaurantReview(comment, starreveiw, userid, categoryid);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCreated response = DataAccess.ReviewCreated.newBuilder()
                .setCode(200)
                .setComment(request.getComment())
                .setStarreview(request.getStarreview()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRestaurantsReviewById(DataAccess.ReviewById request, StreamObserver<DataAccess.Review> responseObserver) {
        Review review = Dao.getRestaurantsReviewById(request.getId());

        DataAccess.Review response = DataAccess.Review.newBuilder()
                .setId(review.getId())
                .setComment(review.getComment())
                .setStarreview(review.getStarReview())
                .setUserid(review.getUserId())
                .setCategoryid(review.getCategoryId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateRestaurantsReviewComment(DataAccess.ReviewsCommentToUpdate request, StreamObserver<DataAccess.ReviewCommentUpdated> responseObserver) {
        int id = request.getId();
        String comment = request.getComment();


        Dao.updateRestaurantsReviewComment(comment, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewCommentUpdated response = DataAccess.ReviewCommentUpdated.newBuilder()
                .setCode(200)
                .setComment(request.getComment()).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void updateRestaurantsStarReview(DataAccess.ReviewStarReviewToUpdate request, StreamObserver<DataAccess.ReviewsStarReviewUpdated> responseObserver) {
        int id = request.getId();
        int starreview = request.getStarreview();


        Dao.updateRestaurantsStarReview(starreview, id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewsStarReviewUpdated response = DataAccess.ReviewsStarReviewUpdated.newBuilder()
                .setCode(200)
                .setStarreview(request.getStarreview())
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteRestaurantsReview(DataAccess.ReviewToDelete request, StreamObserver<DataAccess.ReviewDeleted> responseObserver) {
        int id = request.getId();


        Dao.deleteRestaurantReview(id);

        System.out.println("Received request ==> " + request);
        DataAccess.ReviewDeleted response = DataAccess.ReviewDeleted.newBuilder()
                .setCode(200).build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRestaurantsReviewsContaining(DataAccess.SearchReviewPeremetars request, StreamObserver<DataAccess.ReveiewList> responseObserver) {
        DataAccess.ReveiewList.Builder builder = DataAccess.ReveiewList.newBuilder();

        ArrayList<Review> reviews = Dao.getRestaurantReviewsWithRestaurantsId(request.getCategoryid());

        for (Review review : reviews) {
            builder.addReviews(DataAccess.Review.newBuilder()
                    .setId(review.getId())
                    .setComment(review.getComment())
                    .setStarreview(review.getStarReview())
                    .setUserid(review.getUserId())
                    .setCategoryid(review.getCategoryId())
                    .build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }











    /*
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
/*
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
    public void getReviewsContaining(DataAccess.SearchReviewPeremetars request, StreamObserver<DataAccess.ReveiewList> responseObserver) {
        DataAccess.ReveiewList.Builder builder = DataAccess.ReveiewList.newBuilder();

        ArrayList<Review> reviews = Dao.getReviewssWithParameters(request.getCategoryid(),request.getCategoryname(),request.getCategorytype());

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

*/

    //Report


    @Override
    public void createReport(DataAccess.ReportToCreate request, StreamObserver<DataAccess.ReportCreated> responseObserver) {
        int userid = request.getUserid();
        String description = request.getDescription();
        int reviewid = request.getReviewid();

        Dao.insertReport(userid, description, reviewid);

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
