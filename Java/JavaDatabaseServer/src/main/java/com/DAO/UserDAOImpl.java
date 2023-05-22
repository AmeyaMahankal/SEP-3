package com.DAO;

import com.model.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAOInterface{
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

    @Override
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

    @Override
    public User selectUserWithId(int id) {
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

    @Override
    public ArrayList<User> getUsersWithString(String contain) {
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
}
