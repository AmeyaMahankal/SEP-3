using sep3.DTOs;
using SEP3lu;

namespace Application.LogicInterface;

public interface IRestaurantLogic
{
    Task<Restaurant> CreateAsync(RestaurantCreationDto restaurantToCreate);
    Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto searchParameters);

    Task DeleteAsync(int id);
}
