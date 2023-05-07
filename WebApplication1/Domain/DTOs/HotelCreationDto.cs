namespace sep3.DTOs;

public class HotelCreationDto
{
  
    public string Name { get; }
    public string Description { get; }
    public string ImageURL { get;  }
    public int CityId { get; }

    public HotelCreationDto( string? name, string? description, string imageUrl, int cityId)
    {
    
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}