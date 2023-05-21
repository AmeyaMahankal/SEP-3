using Domain.DTOs;
using Domain.Models;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IHotelsReviewService
{
    public Task<IEnumerable<Review>?> getHotelsReviews(int hotelId);

    Task<Review> CreateReview(ReviewCreationDto dto);
}