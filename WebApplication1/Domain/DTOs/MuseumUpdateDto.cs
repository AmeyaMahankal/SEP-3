namespace sep3.DTOs;

public class MuseumUpdateDto
{
    public int MuseumId { get; }
    public string Name { get; }
    public string Description { get; }

    public MuseumUpdateDto(int museumId,string name, string description)
    {
        MuseumId = museumId;
        Description = description;
        Name = name;
    }
}