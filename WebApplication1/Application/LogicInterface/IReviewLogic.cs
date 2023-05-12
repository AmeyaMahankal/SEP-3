using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterface;

public interface IReviewLogic
{
    Task<Review> CreateAsync(ReviewCreationDto reviewCreation);
    //public Task<Review> GetAsync(SearchReviewByIdDto searchReviewByIdDto);
    Task<IEnumerable<Review>> GetByCategory(SearchReviewParameterDto searchReviewParameterDto); 
      Task UpdateAsync(ReviewUpdateDto dto);

    Task DeleteAsync(int id);

}