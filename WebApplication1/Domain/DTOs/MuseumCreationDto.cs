namespace sep3.DTOs;

public class MuseumCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public MuseumCreationDto(int id,string name, string description)
    {
        Id = id;
        Description = description;
        Name = name;
    }
}