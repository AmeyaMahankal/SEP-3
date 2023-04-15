using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.Models;
using Shared.DTOs;

namespace Application.Logic;

public class ReportLogic: IReportLogic
{
    
    private readonly IReportDao reportDao;
    

    public ReportLogic(IReportDao reportDao)
    {
        this.reportDao = reportDao;
    
    }

    public async Task<Report> CreateAsync(ReportCreationDto dto)
    {
    
        Report report = new Report(dto.Description, dto.ReviewID, dto.ReportedReview);
        Report created = await reportDao.CreateAsync(report);
        return created;
    }

    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto)
    {
        return reportDao.GetAsync(searchReportPeremitersDto);
    }
}