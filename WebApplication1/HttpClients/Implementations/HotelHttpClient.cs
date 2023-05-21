using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterfaces;
using SEP3lu;

namespace HttpClients.Implementations;

public class HotelHttpClient : IHotelService
{
    private readonly HttpClient client;

    public HotelHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<Hotel>?> getHotels(string name)
    {
        string uri = "/hotel";

        uri += $"?name={name}";

        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Hotel> hotels = JsonSerializer.Deserialize<IEnumerable<Hotel>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        
        return hotels;
    }
}