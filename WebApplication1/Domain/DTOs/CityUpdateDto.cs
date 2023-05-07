namespace Domain.DTOs;

public class CityUpdateDto
{
    public int CityId { get; }
    
    public string? Name { get; }
    public string? Description { get; }
    public string ImageURL { get; }

    public CityUpdateDto(int cityId, string? name, string? description, string imageUrl)
    {
        CityId = cityId;
        Name = name;
        Description = description;
        ImageURL = imageUrl;
    }
}