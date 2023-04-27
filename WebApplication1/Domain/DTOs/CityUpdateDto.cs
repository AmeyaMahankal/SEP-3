namespace Domain.DTOs;

public class CityUpdateDto
{
    public int CityId { get; }
    
    public string? Name { get; }
    public string? Description { get; }

    public CityUpdateDto(int cityId, string? name, string? description)
    {
        CityId = cityId;
        Name = name;
        Description = description;
    }
}