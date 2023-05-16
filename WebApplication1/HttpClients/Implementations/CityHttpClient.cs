using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class CityHttpClient : ICityService
{
    private readonly HttpClient client;

    public CityHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<City>?> getCities(string name)
    {
        string uri = "/city";

        uri += $"?name={name}";

        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<City> cities = JsonSerializer.Deserialize<IEnumerable<City>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        
        return cities;
    }
}