using Domain.Models;
using Shared.DTOs;

namespace Application.DAOInterfaces;

public interface IReportDao
{
    Task<Report> CreateAsync(Report report);
    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto);

}