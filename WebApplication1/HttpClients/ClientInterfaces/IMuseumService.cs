using Domain.Models;
using SEP3lu;




namespace HttpClients.ClientInterfaces;

public interface IMuseumService
{
    public Task<IEnumerable<Museum>?> getMuseums(string name);
}