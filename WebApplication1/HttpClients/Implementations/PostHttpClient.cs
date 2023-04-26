using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class PostHttpClient : IPostService
{
    private readonly HttpClient client;

    public PostHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task CreateAsync(CityCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/post", dto);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<IEnumerable<City>?> GetPosts(string? postTitalContains = null)
    {
        string uri = "/post";
        if (!string.IsNullOrEmpty(postTitalContains))
        {
            uri += $"?tital={postTitalContains}";
        }

        HttpResponseMessage response = await client.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        IEnumerable<City> posts = JsonSerializer.Deserialize<IEnumerable<City>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        return posts;
    }
    
    public async Task DeleteAsync(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"post/{id}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}