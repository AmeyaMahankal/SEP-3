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
        throw new NotImplementedException();
    }

    public Task<IEnumerable<Hotel>> GetAsync(SearchHotelParametersDto searchHotelParameters)
    {
        CitysIdFoHotelList request = new CitysIdFoHotelList()
        {
        Cityid = searchHotelParameters.Id
        };

        var send  = client.GetListOfHotels(request);

        List<Hotel> listofhotels = new List<Hotel>();
        foreach (var VARIABLE in send.Hotels)
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
        HotelById request = new HotelById()
        {
            Hotelid  = id
        };

        var send = client.GetHotelById(request);

        Hotel hotel = new Hotel(send.Name, send.Description, send.Imageurl, send.Cityid)
        {
            Id = send.Id
        };

        return Task.FromResult(hotel);
    }

    public Task UpdateAsync(Hotel updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        HotelToDelete request = new HotelToDelete()
        {
            Hotelid = id
        };

        var send = client.DeleteHotel(request);

        return Task.CompletedTask;
    }
    
}