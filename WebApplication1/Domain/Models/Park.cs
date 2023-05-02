namespace SEP3lu;

public class Park
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    

    public Park (int id, string name, string description)
    {
        Id = id;
        Name = name;
        Description = description;
    }
}