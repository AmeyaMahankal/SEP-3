package com.DAO;

import java.sql.*;

public class DAO {

    private Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\Ameya Mahankala\\Documents\\GitHub\\SEP-3\\SEP-3\\Java\\JavaDatabaseServer\\container.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:\\Users\\Ameya Mahankala\\Documents\\GitHub\\SEP-3\\SEP-3\\Java\\JavaDatabaseServer\\" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createUserTable() {

        String url = "jdbc:sqlite:C:\\Users\\Ameya Mahankala\\Documents\\GitHub\\SEP-3\\SEP-3\\Java\\JavaDatabaseServer\\container.db";


        String sql = "create table IF NOT EXISTS Users\n" +
                "(\n" +
                "    Id       INTEGER not null\n" +
                "            primary key autoincrement,\n" +
                "    UserName TEXT    not null,\n" +
                "    Password TEXT    not null,\n" +
                "    Role     TEXT    not null\n" +
                ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String username, String password, String role) {
        String sql = "INSERT INTO Users(UserName,Password,Role) VALUES(?,?,?)";

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


}
