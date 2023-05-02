namespace sep3.DTOs;

public class ParkCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public ParkCreationDto(int id,string name, string description)
    {
        Id = id;
        Description = description;
        Name = name;
    }
}