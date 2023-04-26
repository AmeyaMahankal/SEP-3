namespace Domain.DTOs;

public class CityUpdateDto
{
    public int Id { get; }
    
    public string? Name { get; }
    public string? Description { get; }

    public CityUpdateDto(int id, string? name, string? description)
    {
        Id = id;
        Name = name;
        Description = description;
    }
}