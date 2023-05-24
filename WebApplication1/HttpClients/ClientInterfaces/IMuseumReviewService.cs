using Domain.DTOs;
using Domain.Models;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IMuseumsReviewService
{
    public Task<IEnumerable<Review>?> getMuseumsReviews(int museumId);

    Task<Review> CreateReview(ReviewCreationDto dto);
    public Task DeleteMuseumReview(int id);
}