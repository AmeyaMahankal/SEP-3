namespace sep3.DTOs;

public class ParkCreationDto
{
    public string Name { get; }
    public string Description { get; }

    public string ImageURL { get;  }
    public int CityId { get; }

    public ParkCreationDto( string name, string description, string imageUrl, int cityId)
    {
       
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}