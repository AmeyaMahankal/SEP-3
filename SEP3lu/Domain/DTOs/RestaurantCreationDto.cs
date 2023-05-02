namespace sep3.DTOs;

public class RestaurantCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Description { get; }

    public RestaurantCreationDto(int id,string name, string description)
    {
        Id = id;
        Description = description;
        Name = name;
    }
}