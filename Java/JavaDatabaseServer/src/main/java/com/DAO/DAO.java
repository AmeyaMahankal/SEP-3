package com.DAO;

import com.model.*;

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


    public Hotel getHotelByName(String HotelName) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Hotel";

        Hotel hotel = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getString("Name").equals(HotelName)) {
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


    public Museum getMuseumByName(String MuseumName) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Museum";

        Museum museum = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getString("Name").equals(MuseumName)) {
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


    public Museum getMuseumyById(int MuseumId) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Hotel";

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


    public Park getParkByName(String ParkName) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Park";

        Park park = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getString("Name").equals(ParkName)) {
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


    public Restaurant getRestaurantByName(String RestaurantName) {
        String sql = "SELECT Id,Name,Description,ImageURL, CityId FROM Restaurant";

        Restaurant restaurant = null;

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getString("Name").equals(RestaurantName)) {
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


    public void insertReview(String comment, int starReview, int userId,
                             int categoryId, String categoryName) {
        String sql = "INSERT INTO Review(Comment,StarReview,UserId,CategoryId,CategoryName) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, comment);
            pstmt.setInt(2, starReview);
            pstmt.setInt(3, userId);
            pstmt.setInt(4, categoryId);
            pstmt.setString(5, categoryName);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Review getReviewById(int ReviewId) {
        String sql = "SELECT Id,Comment,StarReview,UserId, CategoryId, CategoryName FROM Review";

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
                    int categoryid = rs.getInt("CategoryId");
                    String categoryname = rs.getString("CategoryName");
                    Review ReviewFound = new Review(id, comment, starreview, userid, categoryid,categoryname);
                    return ReviewFound;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return review;
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













}
