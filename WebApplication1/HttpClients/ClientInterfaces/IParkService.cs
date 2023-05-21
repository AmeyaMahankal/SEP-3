using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IParkService
{
    public Task<IEnumerable<Park>?> getParks(int id);

    Task<Park> CreatePark(ParkCreationDto dto);
}