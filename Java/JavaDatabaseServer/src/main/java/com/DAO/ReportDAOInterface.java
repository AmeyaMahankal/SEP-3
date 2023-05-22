package com.DAO;

import com.model.Report;

import java.util.List;

public interface ReportDAOInterface {
    public void insertReport(int userId, String description, int reviewId);
    public Report getReportById(int ReportId);
    public void deleteReport(int id);
    public List<Report> listOfReports(String empty);

}
