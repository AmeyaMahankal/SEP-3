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

    public Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto searchRestaurantParameters)
    {
        IEnumerable<Restaurant> restaurants = context.Restaurants.AsEnumerable();
        
        if (searchRestaurantParameters.Id != null)
        {
            restaurants = context.Restaurants.Where(u => u.Id.Equals(searchRestaurantParameters.Id));
        }

        return Task.FromResult(restaurants);
    }

    public Task<Restaurant?> GetByIdAsync(int dtoRestaurantId)
    {
        Restaurant? existing = context.Restaurants.FirstOrDefault(u => u.Id == dtoRestaurantId);
        return Task.FromResult(existing);
    }

    
    public Task UpdateAsync(Restaurant updated)
    {
        Restaurant? existing = context.Restaurants.FirstOrDefault(restaurant => restaurant.Id  == updated.Id);
        if (existing == null)
        {
            throw new Exception($"Restaurant with id {updated.Id} does not exist!");
        }

        context.Restaurants.Remove(existing);
        context.Restaurants.Add(updated);
        context.SaveChanges();

        return Task.CompletedTask;
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