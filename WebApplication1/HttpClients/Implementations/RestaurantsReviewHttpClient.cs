using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using sep3.DTOs;
using SEP3lu;

namespace HttpClients.Implementations;

public class RestaurantsReviewHttpClient : IRestaurantsReviewService
{
    private readonly HttpClient client;

    public RestaurantsReviewHttpClient (HttpClient client)
    {
        this.client = client;
    }

    public async Task<IEnumerable<Review>?> getRestaurantsReviews(int categoryid)
    {
        string uri = "/RestaurantsReview";

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
        HttpResponseMessage response = await client.PostAsJsonAsync("/RestaurantsReview",dto);

        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Review review = JsonSerializer.Deserialize<Review>(result)!;
        return review;

    }


    
    /*
    public async Task<Restaurant> CreateRestaurant(RestaurantCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/restaurant", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Restaurant restaurant = JsonSerializer.Deserialize<Restaurant>(result)!;
        return restaurant;
    }*/
}