using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IReviewDao
{
    Task<Review> CreateAsync(Review review);
    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto);
    Task<Review?> GetByIdAsync(int dtoReviewId); 
    
    Task UpdateAsync(Review updated);
    
    Task DeleteAsync(int id);

}