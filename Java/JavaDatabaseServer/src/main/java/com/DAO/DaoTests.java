package com.DAO;

import com.model.User;

import java.util.ArrayList;

public class DaoTests {
    public static void main(String[] args) {
        DAO d=new DAO();
       // d.insertHotel("lknlknl.","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
        //d.insertMuseum("Horsens","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
        //d.insertPark("Horsens","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
        //d.insertRestaurant("Horsens","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
      // d.insertReview("sfsdgdrgh",4,1,1,"lknlknl","sadfsdg");
        //d.updateCityDescription("asfdfefqw",4);

      //  System.out.println( d.getCityById(2));

           // System.out.println( d.listOfReports("empty"));
       // d.insertHotelReview("asfsaf",5,1,1);


      /*
        //Hotel Test

        d.insertHotelReview("good",5,1,1);
        System.out.println(d.getHotelsReviewById(2));
        d.updateHotelsReviewComment("not good",2);
        d.updateHotelsStarReview(2,2);
        System.out.println(d.getHotelsReviewById(2));
        System.out.println(d.getHotelReviewsWithHotelId(1));
        d.deleteHotelReview(4);


        //Museum Test

        d.insertMuseumReview("good",5,1,1);
        d.insertMuseumReview("good",5,1,1);
        d.insertMuseumReview("good",5,1,1);
        d.insertMuseumReview("good",5,1,1);
        d.insertMuseumReview("good",5,1,1);
        System.out.println(d.getMuseumsReviewById(2));
        d.updateMuseumsReviewComment("not good",2);

        d.updateMuseumsStarReview(2,2);
        System.out.println(d.getMuseumsReviewById(2));
        System.out.println(d.getMuseumReviewsWithMuseumsId(1));

        d.deleteMuseumReview(4);

*/

        //Park Test

       // d.insertParkReview("good",5,1,1);
        // d.insertParkReview("good",5,1,1);
        //d.insertParkReview("good",5,1,1);
        //d.insertParkReview("good",5,1,1);
        // d.insertParkReview("good",5,1,1);
        //System.out.println(d.getParksReviewById(2));
        //d.updateParksReviewComment("not good",2);
        //d.updateParksStarReview(2,2);
        //System.out.println(d.getParksReviewById(2));
        // System.out.println(d.getParkReviewsWithParksId(1));
      //  d.deleteParkReview(1);





        //Restaurant Test

        d.insertRestaurantReview("good",5,1,1);
        d.insertRestaurantReview("good",5,1,1);
        d.insertRestaurantReview("good",5,1,1);
        d.insertRestaurantReview("good",5,1,1);
        d.insertRestaurantReview("good",5,1,1);
        System.out.println(d.getRestaurantsReviewById(2));
        d.updateRestaurantsReviewComment("not good",2);
        d.updateRestaurantsStarReview(2,2);
        System.out.println(d.getRestaurantReviewsWithRestaurantsId(1));
        d.deleteRestaurantReview(4);


    }
}
