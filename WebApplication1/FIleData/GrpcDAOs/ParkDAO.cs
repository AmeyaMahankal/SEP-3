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
        CategoryToCreate request = new CategoryToCreate()
        {
            Name = park.Name,
            Description = park.Description,
            Imageurl = park.ImageURL,
            Cityid = park.CityId
        };
        var send = client.CreateParkAsync(request);

        return Task.FromResult(park);
    }

    public Task<IEnumerable<Park>> GetAsync(SearchParkParametersDto searchParameters)
    {
        CitysIdForCategoryList request = new CitysIdForCategoryList()
        {
            Cityid = searchParameters.Id
        };

        var send  = client.GetListOfParksAsync(request);

        List<Park> listofParks = new List<Park>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Categories)
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
           CategoryById request = new CategoryById()
           {
               Categoryid = id
           };

           var send = client.GetParkByIdAsync(request);

           Park park = new Park(send.ResponseAsync.Result.Name, send.ResponseAsync.Result.Description, send.ResponseAsync.Result.Imageurl,send.ResponseAsync.Result.Cityid)
           {
               Id = send.ResponseAsync.Result.Id
           };

           return Task.FromResult(park); 
       }

   public Task UpdateAsync(Park updated)
   {
       throw new NotImplementedException();
   }

   public Task DeleteAsync(int id)
       {
           CategoryToDelete request = new CategoryToDelete()
           {
               Categoryid = id
           };

           var send = client.DeleteParkAsync(request);

           return Task.CompletedTask;
       
       }
      
    
}

