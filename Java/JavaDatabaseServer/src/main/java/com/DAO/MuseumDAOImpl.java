package com.DAO;

import com.model.Museum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuseumDAOImpl implements MuseumDAOInterface {

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
    public void insertMuseum(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Museum(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

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
    public Museum getMuseumyById(int MuseumId) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Museum";

        Museum museum = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == MuseumId) {
                    int id = rs.getInt("Id");
                    String museumname = rs.getString("Name");
                    String description = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    int cityId = rs.getInt("CityId");
                    Museum MuseumFound = new Museum(id, museumname, description, imageurl, cityId);
                    return MuseumFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return museum;
    }

    @Override
    public void updateMuseumName(String name, int id) {
        String sql = "UPDATE Museum SET Name = ? WHERE Id=?;";

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
    public void updateMuseumDescription(String description, int id) {
        String sql = "UPDATE Museum SET Description = ? WHERE Id=?;";

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
    public void deleteMuseum(int id) {
        String sql = "DELETE from Museum WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Museum> listOfMuseums(int cityId) {
        List<Museum> listofmuseums = new ArrayList<>();
        try (Connection conn = this.connect();) {
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT * FROM Museum where CityId=?");
            statement.setInt(1, cityId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                listofmuseums.add(new Museum(resultSet.getInt("Id"), resultSet.getString("Name"), resultSet.getString("Description"),
                        resultSet.getString("ImageURL"), resultSet.getInt("CityId")));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listofmuseums;
    }
}