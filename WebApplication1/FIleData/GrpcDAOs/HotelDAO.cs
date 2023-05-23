using Application.DaoInterfaces;
using DataAccessClient;
using Grpc.Net.Client;
using sep3.DTOs;
using Hotel = SEP3lu.Hotel;

namespace FileData.GrpcDAOs;

public class HotelDAO:IHotelDao
{
    private Access.AccessClient client;
    
    public HotelDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    public Task<Hotel> CreateAsync(Hotel hotel)
    {
        CategoryToCreate request = new CategoryToCreate()
        {
            Name = hotel.Name,
            Description = hotel.Description,
            Imageurl = hotel.ImageURL,
            Cityid = hotel.CityId
        };
        var send = client.CreateHotel(request);
        
        return Task.FromResult(hotel);
    }

    public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchHotelParameters)
    {
        CitysIdForCategoryList request = new CitysIdForCategoryList()
        {
        Cityid = searchHotelParameters.Id
        };

        var send  = client.GetListOfHotelsAsync(request);

        List<Hotel> listofhotels = new List<Hotel>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Categories)
        {
            Hotel hotel = new Hotel(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl, VARIABLE.Cityid)
            {
                Id = VARIABLE.Id
            };
            listofhotels.Add(hotel);
        }

        IEnumerable<Hotel> iHotels = listofhotels;

        return Task.FromResult(iHotels);
    }
    

    public Task<Hotel?> GetByIdAsync(int id)
    {
        CategoryById request = new CategoryById()
        {
            Categoryid  = id
        };

        var send = client.GetHotelByIdAsync(request);

        Hotel hotel = new Hotel(send.ResponseAsync.Result.Name, send.ResponseAsync.Result.Description, send.ResponseAsync.Result.Imageurl, send.ResponseAsync.Result.Cityid)
        {
            Id = send.ResponseAsync.Result.Id
        };

        return Task.FromResult(hotel);
    }

    public Task UpdateAsync(Hotel updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        CategoryToDelete request = new CategoryToDelete()
        {
          Categoryid = id
        };

        var send = client.DeleteHotelAsync(request);

        return Task.CompletedTask;
    }
    
}