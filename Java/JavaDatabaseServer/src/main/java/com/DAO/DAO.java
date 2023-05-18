package com.DAO;

import com.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DAO {

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


    public void insertUser(String username, String password, String role) {
        String sql = "INSERT INTO User(UserName,Password,Role) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, role);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public User selectUserWithUsername(String Username) {
        String sql = "SELECT Id,UserName,Password,Role FROM User";

        User user = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                if (rs.getString("Username").equals(Username)) {
                    int id = rs.getInt("Id");
                    String username = rs.getString("UserName");
                    String password = rs.getString("Password");
                    String role = rs.getString("Role");
                    User UserFound = new User(id, username, password, role);
                    return UserFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public User selectUserWithId(int id){
        String sql = "SELECT Id,UserName,Password,Role FROM User";

        User user=null;

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                if(rs.getInt("Id")==id)
                {
                    int Id=rs.getInt("Id");
                    String username=rs.getString("UserName");
                    String password=rs.getString("Password");
                    String role=rs.getString("Role");
                    User UserFound=new User(Id,username,password,role);
                    return UserFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public ArrayList<User> getUsersWithString(String contain)
    {
        String sql = "SELECT Id,UserName,Password,Role FROM User";

        ArrayList<User> users=new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            if(contain.equals("getall"))
            {
                while (rs.next()) {
                    int Id=rs.getInt("Id");
                    String username=rs.getString("UserName");
                    String password=rs.getString("Password");
                    String role=rs.getString("Role");
                    User UserFound=new User(Id,username,password,role);
                    users.add(UserFound);

                }
                return users;
            }

            // loop through the result set
            while (rs.next()) {
                if(rs.getString("UserName").toString().contains(contain))
                {
                    int Id=rs.getInt("Id");
                    String username=rs.getString("UserName");
                    String password=rs.getString("Password");
                    String role=rs.getString("Role");
                    User UserFound=new User(Id,username,password,role);
                    users.add(UserFound);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return users;
    }

    public ArrayList<City> getCities(String contain)
    {
        String sql="SELECT Id,Name,Description,ImageURL FROM City";

        ArrayList<City> cities = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            if(contain.equals("getall"))
            {
                while(rs.next())
                {
                    int id= rs.getInt("Id");
                    String name=rs.getString("Name");
                    String desc=rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    City city=new City(id,name,desc,imageurl);
                    cities.add(city);
                }
                return cities;
            }

            while(rs.next())
            {
                if(rs.getString("Name").contains(contain))
                {
                    int id= rs.getInt("Id");
                    String name=rs.getString("Name");
                    String desc=rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    City partialcity=new City(id,name,desc,imageurl);
                    cities.add(partialcity);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cities;
    }

    public void insertCity(String name, String description, String imageUrl) {
        String sql = "INSERT INTO City(Name,Description,ImageURL) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setString(3, imageUrl);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public City getCityByName(String CityName) {
        String sql = "SELECT Id,Name,Description,ImageURL FROM City";

        City city = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getString("Name").equals(CityName)) {
                    int id = rs.getInt("Id");
                    String cityname = rs.getString("Name");
                    String description = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    City CityFound = new City(id, cityname, description, imageurl);
                    return CityFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return city;
    }


    public City getCityById(int CityId) {
        String sql = "SELECT Id,Name,Description,ImageURL FROM City";

        City city = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == CityId) {
                    int id = rs.getInt("Id");
                    String cityname = rs.getString("Name");
                    String description = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    City CityFound = new City(id, cityname, description, imageurl);
                    return CityFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return city;
    }


    public void updateCityName(String name, int id) {
        String sql = "UPDATE City SET Name = ? WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateCityDescription(String description, int id) {
        String sql = "UPDATE City SET Description = ? WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, description);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteCity(int id) {
        String sql = "DELETE from City WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



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


    //Hotel Reviews


    public void insertHotelReview(String comment, int starReview, int userId,
                                  int hotelId) {
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


//Museum

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


    //Museum Reviews

    public void insertMuseumReview(String comment, int starReview, int userId,
                                   int museumId) {
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


//Park

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

    //Park Reviews


    //Museum Reviews

    public void insertParkReview(String comment, int starReview, int userId,
                                 int parkId) {
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


    //Restaurant

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




    //Restaurant Reviews

    public void insertRestaurantReview(String comment, int starReview, int userId,
                                       int restaurantId) {
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







    public void insertReport(int userId, String description, int reviewId) {
        String sql = "INSERT INTO Report(UserId,Description,ReviewId) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, description);
            pstmt.setInt(3, reviewId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public Report getReportById(int ReportId) {
        String sql = "SELECT Id,UserId,Description,ReviewId FROM Report";

        Report report = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("Id") == ReportId) {
                    int id = rs.getInt("Id");
                    int userid = rs.getInt("UserId");
                    String description = rs.getString("Description");
                    int reviewid = rs.getInt("ReviewId");
                    Report ReportFound = new Report(id, userid, description, reviewid);
                    return ReportFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return report;
    }


    public void deleteReport(int id) {
        String sql = "DELETE from Report WHERE Id=?;";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public List<Report> listOfReports(String empty) {
        List<Report> listofreports = new ArrayList<>();
        try (Connection conn = this.connect();) {
            PreparedStatement statement = conn.prepareStatement(
                    "SELECT Id,UserId,Description,ReviewId from Report ");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                listofreports.add(new Report(resultSet.getInt("Id"),
                        resultSet.getInt("UserId"),
                        resultSet.getString("Description"),
                        resultSet.getInt("ReviewId")));
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listofreports;
    }





}
