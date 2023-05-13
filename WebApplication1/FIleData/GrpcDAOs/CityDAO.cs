using Application.DaoInterfaces;
using DataAccessClient;
using Domain.DTOs;
using Grpc.Net.Client;
using City = Domain.Models.City;

namespace FileData.GrpcDAOs;

public class CityDAO : ICityDao
{
    
    private Access.AccessClient client;
    
    public CityDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    public Task<City> CreateAsync(City city)
    {
        CityToCreate request = new CityToCreate()
        {
            Description = city.Description,
            Imageurl = city.ImageURL,
            Name = city.Name
        };

        var send = client.CreateCity(request);

        return Task.FromResult(city);
    }

    public Task<IEnumerable<City>> GetAsync(SearchCityParametersDto dto)
    {
        CityByName request = new CityByName()
        {
            Cityname = dto.CityContainsName
        };

        var send = client.GetCities(request);

        List<City> listofcities = new List<City>();
        foreach (var VARIABLE in send.Cities)
        {
            City city = new City(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl)
            {
                Id = VARIABLE.Id
            };
            listofcities.Add(city);
        }

        IEnumerable<City> iCities = listofcities;

        return Task.FromResult(iCities);
    }

    public Task<City?> GetByIdAsync(int id)
    {
        CityById request = new CityById()
        {
            Cityid = id
        };

        var send = client.GetCityById(request);

        City city = new City(send.Name, send.Description, send.Imageurl)
        {
            Id = send.Id
        };

        return Task.FromResult(city);
    }

    public Task UpdateAsync(City updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        throw new NotImplementedException();
    }
}