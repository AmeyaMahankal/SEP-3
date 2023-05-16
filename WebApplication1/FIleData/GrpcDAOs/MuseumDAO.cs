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
        CitysIdForMuseumList request = new CitysIdForMuseumList()
        {
            Cityid = searchMuseumParameters.Id
        };

        var send  = client.GetListOfMuseums(request);

        List<Museum> listofMuseums = new List<Museum>();
        foreach (var VARIABLE in send.Museum)
        {
            Museum museum = new Museum(VARIABLE.Name, VARIABLE.Description, VARIABLE.Imageurl, VARIABLE.Cityid)
            {
                Id = VARIABLE.Id
            };
            listofMuseums.Add(museum);
        }

        IEnumerable<Museum> iMuseums = listofMuseums;

        return Task.FromResult(iMuseums);
    }
    

    public Task<Museum?> GetByIdAsync(int id)
    {
        MuseumById request = new MuseumById()
        {
            Museumid = id
        };

        var send = client.GetMuseumById(request);

        Museum museum = new Museum(send.Name, send.Description, send.Imageurl,send.Cityid)
        {
            Id = send.Id
        };

        return Task.FromResult(museum);
    }

    public Task UpdateAsync(Museum updated)
    {
        throw new NotImplementedException();
    }

    public Task DeleteAsync(int id)
    {
        MuseumToDelete request = new MuseumToDelete()
        {
            Museumid = id
        };

        var send = client.DeleteMuseum(request);

        return Task.CompletedTask;
    }
    
}