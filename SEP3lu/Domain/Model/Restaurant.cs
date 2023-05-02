namespace SEP3lu;

public class Restaurant
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    

    public Restaurant (int id, string name, string description)
    {
        Id = id;
        Name = name;
        Description = description;
    }
}