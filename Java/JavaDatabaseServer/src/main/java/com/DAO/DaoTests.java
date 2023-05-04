package com.DAO;

import com.model.User;

public class DaoTests {
    public static void main(String[] args) {
        DAO d=new DAO();
       // d.insertHotel("lknlknl.","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
        //d.insertMuseum("Horsens","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
        //d.insertPark("Horsens","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
        //d.insertRestaurant("Horsens","it is one of the most beautiful cities on the face of this horrid world","photo-of-hell",1);
      //  d.insertReview("sfsdgdrgh",4,1,1,"lknlknl");
        System.out.println( d.getCityByName("SDFSDG"));

       // System.out.println( d.getCityById(2));
    }
}
