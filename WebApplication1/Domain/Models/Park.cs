namespace SEP3lu;

public class Park
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    

    public Park (string name, string description)
    {
        Name = name;
        Description = description;
    }
}