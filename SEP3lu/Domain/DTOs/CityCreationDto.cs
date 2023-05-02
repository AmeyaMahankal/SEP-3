namespace sep3.DTOs;

public class CityCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public CityCreationDto(int id,string name, string description)
    {
        Id = id;
        Description = description;
        Name = name;
    }
}