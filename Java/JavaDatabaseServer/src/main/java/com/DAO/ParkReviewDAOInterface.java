package com.DAO;

import com.model.Review;

import java.util.ArrayList;

public interface ParkReviewDAOInterface {

    public void insertParkReview(String comment, int starReview, int userId,
                                 int parkId);
    public ArrayList<Review> getParkReviewsWithParksId(int parkId);
    public Review getParksReviewById(int ReviewId);
    public void updateParksReviewComment(String comment, int id);
    public void updateParksStarReview(int star, int id);
    public void deleteParkReview(int id);

}
