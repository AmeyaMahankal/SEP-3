using Application.LogicInterface;
using SEP3lu;
using sep3.DTOs;
namespace Application.DaoInterfaces;

public interface IRestaurantDao
{
    Task<Restaurant> CreateAsync(Restaurant restaurant);
        
    Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto searchRestaurantParameters);
    Task<Restaurant?> GetByIdAsync(int id);
    Task UpdateAsync(Restaurant updated);
    Task DeleteAsync(int id);
    
}