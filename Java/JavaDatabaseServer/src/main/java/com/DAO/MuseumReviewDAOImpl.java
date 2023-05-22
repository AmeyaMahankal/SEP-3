package com.DAO;

import com.model.Review;

import java.sql.*;
import java.util.ArrayList;

public class MuseumReviewDAOImpl implements MuseumReviewDAOInterface{
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
    public void insertMuseumReview(String comment, int starReview, int userId, int museumId) {
        String sql = "INSERT INTO MuseumsReview(Comment,StarReview,UserId,MuseumId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, comment);
            pstmt.setInt(2, starReview);
            pstmt.setInt(3, userId);
            pstmt.setInt(4, museumId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Review> getMuseumReviewsWithMuseumsId(int museumId) {
        String sql = "SELECT * FROM MuseumsReview";

        ArrayList<Review> reviews = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                if (museumId == rs.getInt("MuseumId")) {
                    {
                        int id = rs.getInt("Id");
                        String comment = rs.getString("Comment");
                        int starreview = rs.getInt("StarReview");
                        int userid = rs.getInt("UserId");
                        int categoryid = rs.getInt("MuseumId");

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
    public Review getMuseumsReviewById(int ReviewId) {
        String sql = "SELECT Id,Comment,StarReview,UserId, MuseumId FROM MuseumsReview";

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
                    int categoryid = rs.getInt("MuseumId");

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
    public void updateMuseumsReviewComment(String comment, int id) {
        String sql = "UPDATE MuseumsReview SET Comment = ? WHERE Id=?;";

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
    public void updateMuseumsStarReview(int star, int id) {
        String sql = "UPDATE MuseumsReview SET StarReview = ? WHERE Id=?;";

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
    public void deleteMuseumReview(int id) {
        String sql = "DELETE from MuseumsReview WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
