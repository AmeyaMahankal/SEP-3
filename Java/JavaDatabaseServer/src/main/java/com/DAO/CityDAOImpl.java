package com.DAO;

import com.model.City;

import java.sql.*;
import java.util.ArrayList;

public class CityDAOImpl implements CityDAOInterface {

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
    public ArrayList<City> getCities(String contain) {
        String sql = "SELECT Id,Name,Description,ImageURL FROM City";

        ArrayList<City> cities = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (contain.equals("getall")) {
                while (rs.next()) {
                    int id = rs.getInt("Id");
                    String name = rs.getString("Name");
                    String desc = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    City city = new City(id, name, desc, imageurl);
                    cities.add(city);
                }
                return cities;
            }

            while (rs.next()) {
                if (rs.getString("Name").contains(contain)) {
                    int id = rs.getInt("Id");
                    String name = rs.getString("Name");
                    String desc = rs.getString("Description");
                    String imageurl = rs.getString("ImageURL");
                    City partialcity = new City(id, name, desc, imageurl);
                    cities.add(partialcity);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cities;
    }

    @Override
    public void insertCity(String name, String description, String imageUrl) {
        {
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


    }

    @Override
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

    @Override
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

    @Override
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

    @Override
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

    @Override
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

}
