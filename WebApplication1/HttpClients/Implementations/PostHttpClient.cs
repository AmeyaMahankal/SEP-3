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

    public async Task CreateAsync(PostCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/post", dto);
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<IEnumerable<Post>?> GetPosts(string? postTitalContains = null)
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

        IEnumerable<Post> posts = JsonSerializer.Deserialize<IEnumerable<Post>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        return posts;
    }

   /* public async Task<IEnumerable<Post>> GetPosts(int? userId, string? poster, string? title, string? postBody)
    {
        string query = ConstructQuery(userId, poster, title, postBody);
        HttpResponseMessage response = await client.GetAsync("/posts");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        ICollection<Post> posts = JsonSerializer.Deserialize<ICollection<Post>>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return posts;
    }

    private static string ConstructQuery(int? userId, string? poster, string? title, string? postBody)
    {
        string query = "";


        if (userId != null)
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"userid={userId}";
        }

        if (!string.IsNullOrEmpty(poster))
        {
            query += $"?poster={poster}";
        }


        if (!string.IsNullOrEmpty(title))
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"title={title}";
        }

        if (!string.IsNullOrEmpty(postBody))
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"postBody={postBody}";
        }


        return query;
    }*/
}