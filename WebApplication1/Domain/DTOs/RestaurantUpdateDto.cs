namespace sep3.DTOs;

public class RestaurantUpdateDto
{
    public int RestaurantId { get; }
    public string Name { get; }
    public string Description { get; }

    public RestaurantUpdateDto(int restaurantId,string name, string description)
    {
        RestaurantId = restaurantId;
        Description = description;
        Name = name;
    }
}