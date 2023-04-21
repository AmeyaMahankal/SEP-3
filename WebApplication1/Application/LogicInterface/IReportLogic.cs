using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterface;

public interface IReportLogic
{
    Task<Report> CreateAsync(ReportCreationDto dto);
    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto);

  

    Task DeleteAsync(int id);
}