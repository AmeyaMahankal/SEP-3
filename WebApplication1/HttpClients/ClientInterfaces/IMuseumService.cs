using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IMuseumService
{
    public Task<IEnumerable<Museum>?> getMuseums(int id);

    Task<Museum> CreateMuseum(MuseumCreationDto dto);
}