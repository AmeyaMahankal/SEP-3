using Application.DaoInterfaces;
using DataAccessClient;
using Grpc.Net.Client;
using sep3.DTOs;
using Museum = SEP3lu.Museum;

namespace FileData.GrpcDAOs;

public class MuseumDAO : IMuseumDao
{
    private Access.AccessClient client;
    
    public MuseumDAO()
    {
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        client = new Access.AccessClient(channel);
    }
    
    
    public Task<Museum> CreateAsync(Museum museum)
    {
        CategoryToCreate request = new CategoryToCreate()
        {
            Name = museum.Name,
            Description = museum.Description,
            Imageurl = museum.ImageURL,
            Cityid = museum.CityId
        };
        var send = client.CreateMuseum(request);
        
        return Task.FromResult(museum);
    }

    public Task<IEnumerable<Museum>> GetAsync(SearchMuseumParametersDto searchMuseumParameters)
    {
        CitysIdForCategoryList request = new CitysIdForCategoryList()
        {
            Cityid = searchMuseumParameters.Id
        };

        var send = client.GetListOfMuseumsAsync(request);
        List<Museum> listmus = new List<Museum>();
        foreach (var VARIABLE in send.ResponseAsync.Result.Categories)
        {
            Museum museum = new Museum(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl, VARIABLE.Cityid)
            {
                Id = VARIABLE.Id
            };
            listmus.Add(museum);
        }

        IEnumerable<Museum> ilist = listmus;

        return Task.FromResult(ilist);

    }

    public Task<Museum?> GetByIdAsync(int id)
    {
        throw new NotImplementedException();
    }

    public Task UpdateAsync(Museum updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        throw new NotImplementedException();
    }
}