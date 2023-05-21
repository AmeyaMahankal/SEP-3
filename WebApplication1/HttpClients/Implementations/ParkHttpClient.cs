using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterfaces;
using SEP3lu;

namespace HttpClients.Implementations;

public class ParkHttpClient : IParkService
{
    private readonly HttpClient client;

    public ParkHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<Park>?> getParks(string name)
    {
        string uri = "/park";

        uri += $"?name={name}";

        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Park> parks = JsonSerializer.Deserialize<IEnumerable<Park>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        
        return parks;
    }
}