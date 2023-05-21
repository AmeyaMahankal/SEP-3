using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.Implementations;

public class ParkHttpClient : IParkService
{
    private readonly HttpClient client;

    public ParkHttpClient(HttpClient client)
    {
        this.client = client;
    }


    public async Task<IEnumerable<Park>?> getParks(int id)
    {
        string uri = "/park";

        uri += $"?id={id}";
        
        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Park>? parks = JsonSerializer.Deserialize<IEnumerable<Park>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });

        return parks;

    }

    public async Task<Park> CreatePark(ParkCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/park", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Park park = JsonSerializer.Deserialize<Park>(result)!;
        return park;
    }
}