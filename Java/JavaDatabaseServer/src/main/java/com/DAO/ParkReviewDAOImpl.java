package com.DAO;

import com.model.Review;

import java.sql.*;
import java.util.ArrayList;

public class ParkReviewDAOImpl implements ParkReviewDAOInterface{
    private Connection connect() {
        String url = "jdbc:sqlite:identifier.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;}

    @Override
    public void insertParkReview(String comment, int starReview, int userId, int parkId) {
        String sql = "INSERT INTO ParksReview(Comment,StarReview,UserId,ParkId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, comment);
            pstmt.setInt(2, starReview);
            pstmt.setInt(3, userId);
            pstmt.setInt(4, parkId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Review> getParkReviewsWithParksId(int parkId) {
        String sql = "SELECT * FROM ParksReview";

        ArrayList<Review> reviews = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                if (parkId == rs.getInt("ParkId")) {
                    {
                        int id = rs.getInt("Id");
                        String comment = rs.getString("Comment");
                        int starreview = rs.getInt("StarReview");
                        int userid = rs.getInt("UserId");
                        int categoryid = rs.getInt("ParkId");

                        Review ReviewFound = new Review(id, comment, starreview, userid, categoryid);
                        reviews.add(ReviewFound);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return reviews;
    }

    @Override
    public Review getParksReviewById(int ReviewId) {
        String sql = "SELECT Id,Comment,StarReview,UserId, ParkId FROM ParksReview";

        Review review = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == ReviewId) {
                    int id = rs.getInt("Id");
                    String comment = rs.getString("Comment");
                    int starreview = rs.getInt("StarReview");
                    int userid = rs.getInt("UserId");
                    int categoryid = rs.getInt("ParkId");

                    Review ReviewFound = new Review(id, comment, starreview,
                            userid, categoryid);
                    return ReviewFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return review;
    }

    @Override
    public void updateParksReviewComment(String comment, int id) {
        String sql = "UPDATE ParksReview SET Comment = ? WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, comment);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateParksStarReview(int star, int id) {
        String sql = "UPDATE ParksReview SET StarReview = ? WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, star);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteParkReview(int id) {
        String sql = "DELETE from ParksReview WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
