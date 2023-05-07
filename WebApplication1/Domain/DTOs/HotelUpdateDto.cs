namespace Domain.DTOs;

public class HotelUpdateDto
{
    public int HotelId { get; }
    
    public string? Name { get; }
    public string? Description { get; }
    public string ImageURL { get;  }
    public int CityId { get; }

    public HotelUpdateDto(int hotelId, string? name, string? description, string imageUrl, int cityId)
    {
        HotelId = hotelId;
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}