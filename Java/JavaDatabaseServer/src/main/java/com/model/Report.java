package com.model;

public class Report {
    private int id;
    private int userId;
    private String description;
    private int reviewId;

    public Report(int id, int userId, String description, int reviewId) {
        this.id = id;
        this.userId = userId;
        this.description = description;
        this.reviewId = reviewId;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public int getReviewId() {
        return reviewId;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", userId=" + userId +
                ", description='" + description + '\'' +
                ", reviewId=" + reviewId +
                '}';
    }
}
