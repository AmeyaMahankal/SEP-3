namespace SEP3lu;

public class Hotel
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public string ImageURL { get; set; }
    public int CityId { get; set; }

    public Hotel(string name, string description, string imageUrl, int cityId)
    {
        Name = name;
        Description = description;
        ImageURL = imageUrl;
        CityId = cityId;
    }
}