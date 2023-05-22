package com.DAO;

import com.model.Review;

import java.sql.*;
import java.util.ArrayList;

public class HotelReviewDAOImpl implements HotelReviewInterface {
    private Connection connect() {
        String url = "jdbc:sqlite:identifier.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    @Override
    public void insertHotelReview(String comment, int starReview, int userId, int hotelId) {

            String sql = "INSERT INTO HotelsReview(Comment,StarReview,UserId,HotelId) VALUES(?,?,?,?)";

            try (Connection conn = this.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, comment);
                pstmt.setInt(2, starReview);
                pstmt.setInt(3, userId);
                pstmt.setInt(4, hotelId);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }

    @Override
    public ArrayList<Review> getHotelReviewsWithHotelId(int HotelId) {
        String sql = "SELECT * FROM HotelsReview";

        ArrayList<Review> reviews = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                if (HotelId == rs.getInt("HotelId")) {
                    {
                        int id = rs.getInt("Id");
                        String comment = rs.getString("Comment");
                        int starreview = rs.getInt("StarReview");
                        int userid = rs.getInt("UserId");
                        int categoryid = rs.getInt("HotelId");

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
    public Review getHotelsReviewById(int ReviewId) {
        String sql = "SELECT Id,Comment,StarReview,UserId, HotelId FROM HotelsReview";

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
                    int categoryid = rs.getInt("HotelId");

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
    public void updateHotelsReviewComment(String comment, int id) {
        String sql = "UPDATE HotelsReview SET Comment = ? WHERE Id=?;";

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
    public void updateHotelsStarReview(int star, int id) {
        String sql = "UPDATE HotelsReview SET StarReview = ? WHERE Id=?;";

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
    public void deleteHotelReview(int id) {
        String sql = "DELETE from HotelsReview WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
