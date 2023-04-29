package com.DAO;

import java.sql.*;

public class DAO {
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

    public static void createNewTable() {

        String url = "jdbc:sqlite:C:\\Users\\Ameya Mahankala\\Documents\\GitHub\\SEP-3\\SEP-3\\Java\\JavaDatabaseServer\\container.db";


        String sql = "create table Users\n" +
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
}
