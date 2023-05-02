namespace sep3.DTOs;

public class HotelCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public HotelCreationDto(int id,string name, string description)
    {
        Id = id;
        Description = description;
        Name = name;
    }
}