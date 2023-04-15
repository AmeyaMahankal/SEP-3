using Domain.Models;
using Shared.DTOs;

namespace Application.LogicInterfaces;

public interface IReportLogic
{
    Task<Report> CreateAsync(ReportCreationDto dto);
    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto);
}