using Application.DaoInterfaces;
using DataAccessClient;
using Grpc.Net.Client;
using sep3.DTOs;
using Restaurant = SEP3lu.Restaurant;

namespace FileData.GrpcDAOs;

public class RestaurantDAO : IRestaurantDao
{
    
    private Access.AccessClient client;
    
    public RestaurantDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    
    public Task<Restaurant> CreateAsync(Restaurant restaurant)
    {
        CategoryToCreate request = new CategoryToCreate()
        {
            Name = restaurant.Name,
            Description = restaurant.Description,
            Imageurl = restaurant.ImageURL,
            Cityid = restaurant.CityId
        };
        var send = client.CreateRestaurant(request);
        
        return Task.FromResult(restaurant);
    }

    public Task<IEnumerable<Restaurant>> GetAsync(SearchRestaurantParametersDto searchRestaurantParameters)
    {
        throw new NotImplementedException();
    }

    public Task<Restaurant?> GetByIdAsync(int id)
    {
        throw new NotImplementedException();
    }

    public Task UpdateAsync(Restaurant updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        throw new NotImplementedException();
    }
}