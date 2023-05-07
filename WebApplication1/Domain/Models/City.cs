namespace Domain.Models;

public class City
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string ImageURL { get; set; }

    public City(string name, string description, string imageUrl)
    {
        Name = name;
        Description = description;
        ImageURL = imageUrl;
    }
}