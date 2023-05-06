package com.model;

public class Review {
    private int id;
    private String comment;
    private int starReview;
    private int userId;
    private int categoryId;
    private String categoryName;

    public Review(int id, String comment, int starReview, int userId, int categoryId, String categoryName) {
        this.id = id;
        this.comment = comment;
        this.starReview = starReview;
        this.userId = userId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public int getStarReview() {
        return starReview;
    }

    public int getUserId() {
        return userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }


    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", starReview=" + starReview +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
