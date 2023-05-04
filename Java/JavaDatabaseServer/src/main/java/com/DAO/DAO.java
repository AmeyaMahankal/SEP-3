package com.DAO;

import com.model.City;
import com.model.User;

import java.sql.*;

public class DAO {

    private Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\sarie\\OneDrive\\Dokumenter\\GitHub\\SEP-3\\Java\\JavaDatabaseServer\\identifier.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void insertUser(String username, String password, String role) {
        String sql = "INSERT INTO User(UserName,Password,Role) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3,role);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public User selectUserWithUsername(String Username){
        String sql = "SELECT Id,UserName,Password,Role FROM User";

        User user=null;

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                if(rs.getString("Username").equals(Username))
                {
                    int id=rs.getInt("Id");
                    String username=rs.getString("UserName");
                    String password=rs.getString("Password");
                    String role=rs.getString("Role");
                    User UserFound=new User(id,username,password,role);
                    return UserFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public void insertCity(String name, String description, String imageUrl) {
        String sql = "INSERT INTO City(Name,Description,ImageURL) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3,imageUrl);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public City getCityByName(String CityName){
        String sql = "SELECT Id,Name,Description,ImageURL FROM City";

        City city=null;

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                if(rs.getString("Name").equals(CityName))
                {
                    int id=rs.getInt("Id");
                    String cityname=rs.getString("Name");
                    String description=rs.getString("Description");
                    String imageurl=rs.getString("ImageURL");
                    City CityFound=new City(id,cityname,description,imageurl);
                    return CityFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return city;
    }



    public City getCityById(int CityId){
        String sql = "SELECT Id,Name,Description,ImageURL FROM City";

        City city=null;

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                if(rs.getInt("Id")==CityId)
                {
                    int id=rs.getInt("Id");
                    String cityname=rs.getString("Name");
                    String description=rs.getString("Description");
                    String imageurl=rs.getString("ImageURL");
                    City CityFound=new City(id,cityname,description,imageurl);
                    return CityFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return city;
    }
















    public void insertHotel(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Hotel(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3,imageUrl);
            pstmt.setInt(4,cityId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }






    public void insertMuseum(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Museum(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3,imageUrl);
            pstmt.setInt(4,cityId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



    public void insertPark(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Park(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3,imageUrl);
            pstmt.setInt(4,cityId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }








    public void insertRestaurant(String name, String description, String imageUrl, int cityId) {
        String sql = "INSERT INTO Restaurant(Name,Description,ImageURL,CityId) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3,imageUrl);
            pstmt.setInt(4,cityId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertReview(String comment, int starReview, int userId,
                             int categoryId, String categoryName) {
        String sql = "INSERT INTO Review(Comment,StarReview,UserId,CategoryId,CategoryName) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, comment);
            pstmt.setInt(2, starReview);
            pstmt.setInt(3,userId);
            pstmt.setInt(4,categoryId);
            pstmt.setString(5,categoryName);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }









    public void insertReport(int userId, String description, int reviewId) {
        String sql = "INSERT INTO Report(UserId,Description,ReviewId) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, description);
            pstmt.setInt(3,reviewId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
