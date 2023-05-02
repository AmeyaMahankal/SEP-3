namespace SEP3lu;

public class Restaurant
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    

    public Restaurant ( string name, string description)
    {

        Name = name;
        Description = description;
    }
}