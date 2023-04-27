namespace Domain.DTOs;

public class CityCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public CityCreationDto( string name, string description)
    {
      
        Name = name;
        Description = description;
    }
}