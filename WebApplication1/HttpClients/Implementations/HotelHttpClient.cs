using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.Implementations;

public class HotelHttpClient : IHotelService
{
    private readonly HttpClient client;

    public HotelHttpClient(HttpClient client)
    {
        this.client = client;
    }


    public async Task<IEnumerable<Hotel>?> getHotels(int id)
    {
        string uri = "/hotel";

        uri += $"?id={id}";
        
        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Hotel>? hotels = JsonSerializer.Deserialize<IEnumerable<Hotel>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });

        return hotels;

    }

    public async Task<Hotel> CreateHotel(HotelCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/hotel", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Hotel hotel = JsonSerializer.Deserialize<Hotel>(result)!;
        return hotel;
    }
}