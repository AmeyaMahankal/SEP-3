package com.DAO;

import com.model.Review;

import java.util.ArrayList;

public interface MuseumReviewDAOInterface {
    public void insertMuseumReview(String comment, int starReview, int userId,
                                   int museumId);
    public ArrayList<Review> getMuseumReviewsWithMuseumsId(int museumId);
    public Review getMuseumsReviewById(int ReviewId);
    public void updateMuseumsReviewComment(String comment, int id);
    public void updateMuseumsStarReview(int star, int id);
    public void deleteMuseumReview(int id);


}
