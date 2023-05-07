namespace sep3.DTOs;

public class ParkUpdateDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public string ImageURL { get;  }
    public int CityId { get; }

    public ParkUpdateDto(int id, string name, string description, string imageUrl, int cityId)
    {
        Id = id;
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}