using Application.DaoInterfaces;
using Application.LogicInterface;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class ReportLogic: IReportLogic
{ 
    
    private readonly IReportDao ReportDao;


    public ReportLogic(IReportDao reportDao)
    {
        this.ReportDao = reportDao;
    }


    public async Task<Report> CreateAsync(ReportCreationDto dto)
    {
        Report report = new Report(dto.UserId,dto.Description, dto.ReviewID);
        Report created = await ReportDao.CreateAsync(report);
        return created;
    }

    
    
    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto)
    {
        return ReportDao.GetAsync(searchReportPeremitersDto);
    }

    public async Task DeleteAsync(int id)
    {
        Report? report = await ReportDao.GetByIdAsync(id);
        if (report == null)
        {
            throw new Exception($"Report with ID {id} was not found!");
        }

        await ReportDao.DeleteAsync(id);
    }
}