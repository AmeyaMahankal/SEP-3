using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

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

    public Task<Report?> GetByIdAsync(int dtoReportId)
    {
        Report? existing = context.Reports.FirstOrDefault(u => u.Id == dtoReportId);
        return Task.FromResult(existing);
    }

    public Task DeleteAsync(int id)
    {
        Report? existing = context.Reports.FirstOrDefault(post => post.Id == id);
        if (existing==null)
        {
            throw new Exception($"Report with id {id} does not exist!");
        }
        
        context.Reports.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }
    
}