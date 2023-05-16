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
        CitysIdForParkList request = new CitysIdForParkList()
        {
            Cityid = searchParameters.Id
        };

        var send  = client.GetListOfParks(request);

        List<Park> listofParks = new List<Park>();
        foreach (var VARIABLE in send.Park)
        {
            Park park = new Park(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl, VARIABLE.Cityid)
            {
                Id = VARIABLE.Id
            };
            listofParks.Add(park);
        }

        IEnumerable<Park> iParks = listofParks;

        return Task.FromResult(iParks);
       }
   
   
   public Task<Park?> GetByIdAsync(int id)
       {
           ParkById request = new ParkById()
           {
               Parkid = id
           };

           var send = client.GetParkById(request);

           Park park = new Park(send.Name, send.Description, send.Imageurl,send.Cityid)
           {
               Id = send.Id
           };

           return Task.FromResult(park); 
       }

   public Task UpdateAsync(Park updated)
   {
       throw new NotImplementedException();
   }

   public Task DeleteAsync(int id)
       {
           ParkToDelete request = new ParkToDelete()
           {
               Parkid = id
           };

           var send = client.DeletePark(request);

           return Task.CompletedTask;
       
       }
      
    
}

