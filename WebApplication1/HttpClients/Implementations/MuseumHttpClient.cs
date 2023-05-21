using System.Text.Json;
using Domain.Models;
using HttpClients.ClientInterfaces;
using SEP3lu;

namespace HttpClients.Implementations;

public class MuseumHttpClient : IMuseumService
{
    private readonly HttpClient client;

    public MuseumHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<Museum>?> getMuseums(string name)
    {
        string uri = "/museum";

        uri += $"?name={name}";

        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Museum> museums = JsonSerializer.Deserialize<IEnumerable<Museum>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        
        return museums;
    }
}