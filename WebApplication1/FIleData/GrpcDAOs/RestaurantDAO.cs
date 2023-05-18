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
        CitysIdForCategoryList request = new CitysIdForCategoryList()
        {
            Cityid = searchRestaurantParameters.Id
        };

        var send  = client.GetListOfRestaurantAsync(request);

        List<Restaurant> listofRestaurants = new List<Restaurant>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Categories)
        {
            Restaurant restaurant = new Restaurant(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl, VARIABLE.Cityid)
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
        CategoryById request = new CategoryById()
        {
            Categoryid = id
        };

        var send = client.GetRestaurantByIdAsync(request);

        Restaurant restaurant = new Restaurant(send.ResponseAsync.Result.Name, send.ResponseAsync.Result.Description, send.ResponseAsync.Result.Imageurl,send.ResponseAsync.Result.Cityid)
        {
            Id = send.ResponseAsync.Result.Id
        };

        return Task.FromResult(restaurant);
    }

    public Task UpdateAsync(Restaurant updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        CategoryToDelete request = new CategoryToDelete()
        {
            Categoryid = id
        };

        var send = client.DeleteRestaurantAsync(request);

        return Task.CompletedTask;
    }
}