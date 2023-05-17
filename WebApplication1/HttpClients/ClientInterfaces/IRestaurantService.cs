using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IRestaurantService
{
    public Task<IEnumerable<Restaurant>?> getRestaurants(int id);

    Task<Restaurant> CreateRestaurant(RestaurantCreationDto dto);
}