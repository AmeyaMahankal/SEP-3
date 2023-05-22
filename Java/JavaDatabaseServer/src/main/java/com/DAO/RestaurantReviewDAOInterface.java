package com.DAO;

import com.model.Review;

import java.util.ArrayList;

public interface RestaurantReviewDAOInterface {
    public void insertRestaurantReview(String comment, int starReview, int userId,
                                       int restaurantId);
    public ArrayList<Review> getRestaurantReviewsWithRestaurantsId(int museumId);
    public Review getRestaurantsReviewById(int ReviewId);
    public void updateRestaurantsReviewComment(String comment, int id);
    public void updateRestaurantsStarReview(int star, int id);
    public void deleteRestaurantReview(int id);
}
