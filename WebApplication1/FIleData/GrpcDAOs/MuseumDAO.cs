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
        MuseumToCreate request = new MuseumToCreate()
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
        throw new NotImplementedException();
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