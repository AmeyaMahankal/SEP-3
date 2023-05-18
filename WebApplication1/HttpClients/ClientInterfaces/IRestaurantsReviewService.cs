using Domain.DTOs;
using Domain.Models;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IRestaurantsReviewService
{
    public Task<IEnumerable<Review>?> getRestaurantsReviews(int restaurantId);

    Task<Restaurant> CreateReview(ReviewCreationDto dto);
}