namespace sep3.DTOs;

public class SearchParkParametersDto
{
    public string? NameContains { get; set; }
    public string? Name { get; set; }
    
    public int? Id { get; set; }

    public SearchParkParametersDto(string? nameContains, string? name, int? id)
    {
        NameContains = nameContains;
        Name = name;
        Id = id;
    }

  
}