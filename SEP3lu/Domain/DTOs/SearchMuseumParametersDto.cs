namespace sep3.DTOs;

public class SearchMuseumParametersDto
{
    public string? NameContains { get; set; }
    public string? Name { get; set; }
    
    public int? Id { get; set; }

    public SearchMuseumParametersDto(string? nameContains, string? name, int? id)
    {
        NameContains = nameContains;
        Name = name;
        Id = id;
    }

  
}