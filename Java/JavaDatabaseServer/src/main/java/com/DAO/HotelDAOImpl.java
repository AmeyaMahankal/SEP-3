package com.DAO;

import com.model.Hotel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDAOImpl implements HotelDAOInterface{
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
    public void insertHotel(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Hotel(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

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
    public Hotel getHotelyById(int HotelId) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Hotel";

        Hotel hotel = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == HotelId) {
                    int id = rs.getInt("Id");
                    String hotelname = rs.getString("Name");
                    String description = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    int cityId = rs.getInt("CityId");
                    Hotel HotelFound = new Hotel(id, hotelname, description, imageurl, cityId);
                    return HotelFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hotel;
    }

    @Override
    public void updateHotelName(String name, int id) {
        String sql = "UPDATE Hotel SET Name = ? WHERE Id=?;";

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
    public void updateHotelDescription(String description, int id) {
        String sql = "UPDATE Hotel SET Description = ? WHERE Id=?;";

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
    public void deleteHotel(int id) {
        String sql = "DELETE from Hotel WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Hotel> listOfHotels(int cityId) {
        List<Hotel> list = new ArrayList<>();
        try (Connection conn = this.connect();) {
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT * FROM Hotel where CityId=?");
            statement.setInt(1, cityId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new Hotel(resultSet.getInt("Id"), resultSet.getString("Name"), resultSet.getString("Description"),
                        resultSet.getString("ImageURL"), resultSet.getInt("CityId")));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
