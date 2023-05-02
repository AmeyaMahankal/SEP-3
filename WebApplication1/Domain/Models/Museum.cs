namespace SEP3lu;

public class Museum
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    

    public Museum ( string name, string description)
    {
        Name = name;
        Description = description;
    }
}