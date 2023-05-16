using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface ICityService
{
    public Task<IEnumerable<City>?> getCities(string name);
}