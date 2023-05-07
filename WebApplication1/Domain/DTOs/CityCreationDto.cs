namespace Domain.DTOs;

public class CityCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }
    public string ImageURL { get; }

    public CityCreationDto(int id, string name, string description, string imageUrl)
    {
        Id = id;
        Name = name;
        Description = description;
        ImageURL = imageUrl;
    }
}