using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterface;

public interface IReviewLogic
{
    Task<Review> CreateAsync(ReviewCreationDto reviewCreation);
    Task<IEnumerable<Review>> GetByCategory(SearchReviewParameterDto searchReviewParameterDto); 
      Task UpdateReviewCommentAsync(ReviewUpdateCommentDto commentDto);
      Task UpdateReviewStarReviewAsync(ReviewUpdateStarReviewDto starReviewDto);
    Task DeleteAsync(int id);

}