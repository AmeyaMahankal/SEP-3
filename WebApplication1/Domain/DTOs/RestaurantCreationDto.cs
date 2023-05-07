namespace sep3.DTOs;

public class RestaurantCreationDto
{
 
    public string Name { get; }
    public string Description { get; }

    public string ImageURL { get;  }
    public int CityId { get; }

    public RestaurantCreationDto( string name, string description, string imageUrl, int cityId)
    {
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}