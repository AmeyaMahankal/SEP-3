using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IReportDao
{
    Task<Report> CreateAsync(Report report);
    public Task<IEnumerable<Report>> GetAsync(SearchReportPeremitersDto searchReportPeremitersDto);
    Task<Report?> GetByIdAsync(int dtoReviewId);
    
    Task DeleteAsync(int id);
}