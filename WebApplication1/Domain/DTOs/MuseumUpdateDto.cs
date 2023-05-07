namespace sep3.DTOs;

public class MuseumUpdateDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }
    public string ImageURL { get;  }
    public int CityId { get; }

    public MuseumUpdateDto(int museumId, string name, string description, string imageUrl, int cityId)
    {
        Id = museumId;
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}