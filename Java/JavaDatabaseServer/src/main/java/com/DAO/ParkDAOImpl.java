package com.DAO;

import com.model.Park;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ParkDAOImpl implements ParkDAOInterface{
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
    public void insertPark(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Park(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

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
    public Park getParkById(int ParkId) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Park";

        Park park = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == ParkId) {
                    int id = rs.getInt("Id");
                    String parkname = rs.getString("Name");
                    String description = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    int cityId = rs.getInt("CityId");
                    Park ParkFound = new Park(id, parkname, description, imageurl, cityId);
                    return ParkFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return park;
    }

    @Override
    public void updateParkName(String name, int id) {
        String sql = "UPDATE Park SET Name = ? WHERE Id=?;";

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
    public void updateParkDescription(String description, int id) {
        String sql = "UPDATE Park SET Description = ? WHERE Id=?;";

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
    public void deletePark(int id) {
        String sql = "DELETE from Park WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Park> listOfParks(int cityId) {
        List<Park> listofparks = new ArrayList<>();
        try (Connection conn = this.connect();) {
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT * FROM Park where CityId=?");
            statement.setInt(1, cityId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                listofparks.add(new Park(resultSet.getInt("Id"), resultSet.getString("Name"), resultSet.getString("Description"),
                        resultSet.getString("ImageURL"), resultSet.getInt("CityId")));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listofparks;
    }
}
