namespace Domain.Models;

public class City
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }

    public City( string name, string description)
    {
     
        Name = name;
        Description = description;
    }
}