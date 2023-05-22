package com.DAO;

import com.model.Restaurant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDAOImpl implements RestaurantDAOInterface{
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
    public void insertRestaurant(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Restaurant(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3, imageUrl);
            pstmt.setInt(4, cityId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Restaurant getRestaurantById(int RestaurantId) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Restaurant";

        Restaurant restaurant = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == RestaurantId) {
                    int id = rs.getInt("Id");
                    String restaurantname = rs.getString("Name");
                    String description = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    int cityId = rs.getInt("CityId");
                    Restaurant RestaurantFound = new Restaurant(id, restaurantname, description, imageurl, cityId);
                    return RestaurantFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return restaurant;
    }

    @Override
    public void updateRestaurantName(String name, int id) {
        String sql = "UPDATE Restaurant SET Name = ? WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateRestaurantDescription(String description, int id) {
        String sql = "UPDATE Restaurant SET Description = ? WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, description);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteRestaurant(int id) {
        String sql = "DELETE from Restaurant WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Restaurant> listOfRestaurant(int cityId) {
        List<Restaurant> listofrestaurant = new ArrayList<>();
        try (Connection conn = this.connect();) {
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT * FROM Restaurant where CityId=?");
            statement.setInt(1, cityId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                listofrestaurant.add(new Restaurant(resultSet.getInt("Id"), resultSet.getString("Name"), resultSet.getString("Description"),
                        resultSet.getString("ImageURL"), resultSet.getInt("CityId")));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listofrestaurant;
    }
}
