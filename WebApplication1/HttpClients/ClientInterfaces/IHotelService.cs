using sep3.DTOs;
using SEP3lu;

namespace HttpClients.ClientInterfaces;

public interface IHotelService
{
    public Task<IEnumerable<Hotel>?> getHotels(int id);

    Task<Hotel> CreateHotel(HotelCreationDto dto);
}