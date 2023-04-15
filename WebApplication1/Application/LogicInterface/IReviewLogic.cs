using Domain.Models;
using Shared.DTOs;

namespace Application.LogicInterfaces;

public interface IReviewLogic
{
    Task<Review> CreateAsync(ReviewCreationDto reviewCreation);
    public Task<IEnumerable<Review>> GetAsync(SearchReviewParameterDto searchReviewParameterDto);
}