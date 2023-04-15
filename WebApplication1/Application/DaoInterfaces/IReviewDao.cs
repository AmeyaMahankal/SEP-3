using Domain.Models;
using Shared.DTOs;

namespace Application.DAOInterfaces;

public interface IReviewDao
{
    Task<Review> CreateAsync(Review review);
    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto);
    
}