using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IRestaurantsReviewDao
{
    Task<Review> CreateAsync(Review review);
    Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto); 
    Task<Review?> GetByIdAsync(int dtoReviewId);
    Task UpdateReviewCommentAsync(Review updated);
    Task UpdateReviewStarReviewAsync(Review updated);
    Task DeleteAsync(int id);

}