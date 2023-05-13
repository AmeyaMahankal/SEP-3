using Application.DaoInterfaces;
using DataAccessClient;
using Grpc.Net.Client;
using sep3.DTOs;
using Park = SEP3lu.Park;

namespace FileData.GrpcDAOs;

public class ParkDAO : IParkDao
{
    private Access.AccessClient client;

    public ParkDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);

    }

    public Task<Park> CreateAsync(Park park)
    {
        ParkToCreate request = new ParkToCreate()
        {
            Name = park.Name,
            Description = park.Description,
            Imageurl = park.ImageURL,
            Cityid = park.CityId
        };
        var send = client.CreatePark(request);

        return Task.FromResult(park);
    }

    public Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto searchParameters)
    {
        throw new NotImplementedException();
       }
   
   
   public Task<Park?> GetByIdAsync(int id)
       {
           throw new NotImplementedException(); 
       }

   public Task UpdateAsync(Park updated)
   {
       throw new NotImplementedException();
   }

   public Task DeleteAsync(int id)
       {
           throw new NotImplementedException();
       }
      
    
}

