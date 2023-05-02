namespace sep3.DTOs;

public class SearchCityParametersDto
{
    public string? NameContains { get; set; }
    public string? Name { get; set; }
    
    public int? Id { get; set; }

    public SearchCityParametersDto(string? nameContains, string? name, int? id)
    {
        NameContains = nameContains;
        Name = name;
        Id = id;
    }

  
}