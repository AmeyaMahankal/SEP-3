using System.Text.Json;
using HttpClients.ClientInterfaces;
using SEP3lu;

namespace HttpClients.Implementations;

public class RestaurantHttpClient : IRestaurantService
{
    private readonly HttpClient client;

    public RestaurantHttpClient(HttpClient client)
    {
        this.client = client;
    }


    public async Task<IEnumerable<Restaurant>?> getRestaurants(int id)
    {
        string uri = "/restaurant";

        uri += $"?id={id}";
        
        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        
        IEnumerable<Restaurant> restaurants = JsonSerializer.Deserialize<IEnumerable<Restaurant>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });

        return restaurants;

    }
}