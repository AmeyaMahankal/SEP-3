namespace Domain.DTOs;

public class HotelUpdateDto
{
    public int HotelId { get; }
    
    public string? Name { get; }
    public string? Description { get; }

    public HotelUpdateDto(int hotelId, string? name, string? description)
    {
        HotelId = hotelId;
        Name = name;
        Description = description;
    }
}