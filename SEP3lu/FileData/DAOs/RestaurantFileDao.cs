using Application.DaoInterfaces;
using Application.LogicInterface;
using sep3.DTOs;
using SEP3lu;

namespace FileData.DAOs;

public class RestaurantFileDao : IRestaurantDao

{
    private readonly FileContext context;

    public RestaurantFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Restaurant> CreateAsync(Restaurant restaurant)
    {
        int restaurantId = 1;
        if (context.Restaurants.Any())
        {
            restaurantId = context.Restaurants.Max(u => u.Id);
            restaurantId++;
        }

        restaurant.Id = restaurantId;
        
        context.Restaurants.Add(restaurant);
        context.SaveChanges();

        return Task.FromResult(restaurant);
    }

    public Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto dto)
    {
        IEnumerable<Restaurant> result = context.Restaurants.AsEnumerable();
        if (!string.IsNullOrEmpty(dto.Name))
        {
            result = context.Restaurants.Where(u => u.Name.Equals(dto.NameContains, StringComparison.OrdinalIgnoreCase));
        }
        if (dto.Name!=null)
        {
            result = result.Where((t => t.Name == dto.Name));
        }

        if (!string.IsNullOrEmpty(dto.NameContains))
        {
            result = result.Where(t => t.Name.Contains(dto.NameContains, StringComparison.OrdinalIgnoreCase));
        }

        return Task.FromResult(result);
    }

    public Task<Restaurant?> GetByIdAsync(int dtoRestaurantId)
    {
        Restaurant? existing = context.Restaurants.FirstOrDefault(u => u.Id == dtoRestaurantId);
        return Task.FromResult(existing);
    }
    
    public Task DeleteAsync(int id)
    {
        Restaurant? existing = context.Restaurants.FirstOrDefault(restaurant => restaurant.Id == id);
        if (existing==null)
        {
            throw new Exception($"Does not exist!");
        }
        
        context.Restaurants.Remove(existing);
        context.SaveChanges();
        return Task.CompletedTask;
    }

}