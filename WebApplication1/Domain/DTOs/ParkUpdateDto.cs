namespace sep3.DTOs;

public class ParkUpdateDto
{
    public int ParkId { get; }
    public string Name { get; }
    public string Description { get; }

    public ParkUpdateDto(int parkid,string name, string description)
    {
        ParkId = parkid;
        Description = description;
        Name = name;
    }
}