using Domain.DTOs;
using Domain.Models;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IParksReviewService
{
    public Task<IEnumerable<Review>?> getParksReviews(int parkId);

    Task<Review> CreateReview(ReviewCreationDto dto);
}