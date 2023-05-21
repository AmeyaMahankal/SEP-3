using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.Implementations;

public class MuseumsReviewHttpClient : IMuseumsReviewService
{
    private readonly HttpClient client;

    public MuseumsReviewHttpClient (HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<Review>?> getMuseumsReviews(int categoryid)
    {
        string uri = "/MuseumsReview";

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

    public Task<Review> CreateReview(ReviewCreationDto dto)
    {
        throw new NotImplementedException();
    }


    

}