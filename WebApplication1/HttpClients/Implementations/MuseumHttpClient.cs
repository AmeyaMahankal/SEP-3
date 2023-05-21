using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.Implementations;

public class MuseumHttpClient : IMuseumService
{
    private readonly HttpClient client;

    public MuseumHttpClient(HttpClient client)
    {
        this.client = client;
    }


    public async Task<IEnumerable<Museum>?> getMuseums(int id)
    {
        string uri = "/museum";

        uri += $"?id={id}";
        
        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Museum>? museums = JsonSerializer.Deserialize<IEnumerable<Museum>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });

        return museums;

    }

    public async Task<Museum> CreateMuseum(MuseumCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/museum", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Museum museum = JsonSerializer.Deserialize<Museum>(result)!;
        return museum;
    }
}