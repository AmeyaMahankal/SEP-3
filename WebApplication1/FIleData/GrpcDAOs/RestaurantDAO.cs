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
        RestaurantToCreate request = new RestaurantToCreate()
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
        CitysIdForRestaurantList request = new CitysIdForRestaurantList()
        {
            Cityid = searchRestaurantParameters.Id
        };

        var send  = client.GetListOfRestaurant(request);

        List<Restaurant> listofRestaurants = new List<Restaurant>();
        foreach (var VARIABLE in send.Restaurant)
        {
            Restaurant restaurant = new Restaurant(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl, VARIABLE.Id)
            {
                Id = VARIABLE.Id
            };
            listofRestaurants.Add(restaurant);
        }

        IEnumerable<Restaurant> iRestaurants = listofRestaurants;

        return Task.FromResult(iRestaurants);
    
    }

    public Task<Restaurant?> GetByIdAsync(int id)
    {
        RestaurantById request = new RestaurantById()
        {
            Restaurantid = id
        };

        var send = client.GetRestaurantById(request);

        Restaurant restaurant = new Restaurant(send.Name, send.Description, send.Imageurl,send.Cityid)
        {
            Id = send.Id
        };

        return Task.FromResult(restaurant);
    }

    public Task UpdateAsync(Restaurant updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        RestaurantToDelete request = new RestaurantToDelete()
        {
            Restaurantid = id
        };

        var send = client.DeleteRestaurant(request);

        return Task.CompletedTask;
    }
}