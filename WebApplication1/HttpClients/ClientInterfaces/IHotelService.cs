using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IHotelService
{
    public Task<IEnumerable<Hotel>?> getHotels(string name);
}