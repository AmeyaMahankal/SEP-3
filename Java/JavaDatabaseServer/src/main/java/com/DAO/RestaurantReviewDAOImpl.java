package com.DAO;

import com.model.Review;

import java.sql.*;
import java.util.ArrayList;

public class RestaurantReviewDAOImpl implements RestaurantReviewDAOInterface{
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
    public void insertRestaurantReview(String comment, int starReview, int userId, int restaurantId) {
        String sql = "INSERT INTO RestaurantsReview(Comment,StarReview,UserId,RestaurantId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, comment);
            pstmt.setInt(2, starReview);
            pstmt.setInt(3, userId);
            pstmt.setInt(4, restaurantId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Review> getRestaurantReviewsWithRestaurantsId(int museumId) {
        String sql = "SELECT * FROM RestaurantsReview";

        ArrayList<Review> reviews = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                if (museumId == rs.getInt("RestaurantId")) {
                    {
                        int id = rs.getInt("Id");
                        String comment = rs.getString("Comment");
                        int starreview = rs.getInt("StarReview");
                        int userid = rs.getInt("UserId");
                        int categoryid = rs.getInt("RestaurantId");

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
    public Review getRestaurantsReviewById(int ReviewId) {
        String sql = "SELECT Id,Comment,StarReview,UserId, RestaurantId FROM RestaurantsReview";

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
                    int categoryid = rs.getInt("RestaurantId");

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
    public void updateRestaurantsReviewComment(String comment, int id) {
        String sql = "UPDATE RestaurantsReview SET Comment = ? WHERE Id=?;";

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
    public void updateRestaurantsStarReview(int star, int id) {
        String sql = "UPDATE RestaurantsReview SET StarReview = ? WHERE Id=?;";

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
    public void deleteRestaurantReview(int id) {
        String sql = "DELETE from RestaurantsReview WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
