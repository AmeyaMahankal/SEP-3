using Domain.Models;
using SEP3lu;


namespace HttpClients.ClientInterfaces;

public interface IParkService
{
    public Task<IEnumerable<Park>?> getParks(string name);
}