using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.Implementations;

public class HotelsReviewHttpClient : IHotelsReviewService
{
    private readonly HttpClient client;

    public HotelsReviewHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public HotelsReviewHttpClient()
    {
    }

    public async Task<IEnumerable<Review>?> getHotelsReviews(int categoryid)
    {
        string uri = "/HotelsReview";

        uri += $"?categoryid={categoryid}";

        HttpResponseMessage response = await client.GetAsync(uri);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        IEnumerable<Review>? reviews = JsonSerializer.Deserialize<IEnumerable<Review>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });

        return reviews;


    }

    public async Task<Review> CreateReview(ReviewCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/HotelsReview",dto);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Review review = JsonSerializer.Deserialize<Review>(result)!;
        return review;
    }


    public async Task DeleteHotelReview(int id)
    {
        HttpResponseMessage response = await client.DeleteAsync($"/HotelsReview/{id}");
        if (!response.IsSuccessStatusCode)
        {
            string content = await response.Content.ReadAsStringAsync();
            throw new Exception(content);
        }


    }
}