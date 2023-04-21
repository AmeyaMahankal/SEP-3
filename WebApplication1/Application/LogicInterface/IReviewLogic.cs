using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterface;

public interface IReviewLogic
{
    Task<Review> CreateAsync(ReviewCreationDto reviewCreation);
    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto);
    
    
    Task UpdateAsync(ReviewUpdateDto dto);

    Task DeleteAsync(int id);

}