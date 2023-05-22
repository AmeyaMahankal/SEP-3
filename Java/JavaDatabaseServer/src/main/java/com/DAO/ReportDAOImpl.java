package com.DAO;

import com.model.Report;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReportDAOImpl implements ReportDAOInterface{
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

    @Override
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

    @Override
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

    @Override
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
