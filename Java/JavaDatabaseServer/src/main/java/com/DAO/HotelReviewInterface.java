package com.DAO;

import com.model.Review;

import java.util.ArrayList;

public interface HotelReviewInterface {

    public void insertHotelReview(String comment, int starReview, int userId,
                                  int hotelId);
    public ArrayList<Review> getHotelReviewsWithHotelId(int HotelId);

    public Review getHotelsReviewById(int ReviewId);
    public void updateHotelsReviewComment(String comment, int id);
    public void updateHotelsStarReview(int star, int id);
    public void deleteHotelReview(int id);

}
