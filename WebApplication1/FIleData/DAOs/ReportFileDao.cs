using Application.DAOInterfaces;
using Domain.Models;
using Shared.DTOs;

namespace FileData.DAOs;

public class ReportFileDao: IReportDao
{
    private readonly FileContext context;

    public ReportFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Report> CreateAsync(Report report)
    {
        int reportId = 1;
        if (context.Reports.Any())
        {
            reportId = context.Reports.Max(u => u.Id);
            reportId++;
        }

        report.Id = reportId;
        
        context.Reports.Add(report);
        context.SaveChanges();

        return Task.FromResult(report);
    }

    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto)
    {
        IEnumerable<Report> reports = context.Reports.AsEnumerable();
        if (searchReportPeremitersDto.ReportContainsId!= null)
        {
            reports = context.Reports.Where(u => u.Id.Equals(searchReportPeremitersDto.ReportContainsId));
        }

        return Task.FromResult(reports);
    }
}